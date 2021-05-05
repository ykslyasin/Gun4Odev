package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(customer.getNationalId() , 
				                       customer.getFirstName() , 
				                       customer.getLastName() , 
				                       customer.getDateOfBirth().getYear());
	}
	
	
}
