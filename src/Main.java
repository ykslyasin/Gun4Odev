import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapter.MerniceServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Yasin");
		customer.setLastName("Yüksel");
		customer.setDateOfBirth(LocalDate.of(1999, 10, 3));
		customer.setNationalId(27089548148L);
		
		try {
			customerManager.Save(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
