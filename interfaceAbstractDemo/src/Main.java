import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import entities.Customer;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		BaseCustomerManager customerManagerNero = new NeroCustomerManager(new CustomerCheckManager());
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(1);
		customerStarbucks.setFirstName("ahmet");
		customerStarbucks.setLastName("ak");
		customerStarbucks.setNationlaityId("11111111111");
		customerStarbucks.setDateOfBirth(LocalDate.of(199, 2, 4));
		customerManagerStarbucks.save(customerStarbucks);
		
		
		
		Customer customerNero = new Customer();
		customerNero.setId(2);
		customerNero.setFirstName("mehmet");
		customerNero.setLastName("ay");
		customerNero.setNationlaityId("22222222222");
		customerNero.setDateOfBirth(LocalDate.of(2000,3,6));
		customerManagerNero.save(customerNero);
	}

}
