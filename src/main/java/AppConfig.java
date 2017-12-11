import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		// constructor injection 
//		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		// Setter injection
//		//service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
