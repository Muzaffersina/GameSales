package adapters.concretes;

import java.rmi.RemoteException;

import adapters.abstracts.PersonCheckService;
import entities.concrets.Gamers;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {
	private boolean durum=true;
	
	@Override
	public boolean CheckIfRealPerson(Gamers gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {			
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNatioanalityID()),gamer.getFirstName(),gamer.getLastName(),gamer.getBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			durum = false;
		}
		return durum;
	}

}
