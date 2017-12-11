import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.CustomerRepository;
import com.example.repository.HibernateCustomerRepositoryImpl;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		// constructor injection 
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
		// Setter injection
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
