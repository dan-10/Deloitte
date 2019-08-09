import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Customer getCustObject() {
		return new Customer();
	}
	
	@Bean
	public Address getAddObject() {
		return new Address();
	}
	
}
