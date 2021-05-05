package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception{
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
			
		}else {
			
			throw new Exception("Ge�erli bir ki�i de�il");
		}
		
		
	}
	
}
