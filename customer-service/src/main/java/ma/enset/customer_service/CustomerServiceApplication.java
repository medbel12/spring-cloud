package ma.enset.customer_service;

import ma.enset.customer_service.entities.Customer;
import ma.enset.customer_service.repository.CustomerRepositoey;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepositoey customerRepositoey , RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Customer.class);
		return args -> {
			customerRepositoey.save(new Customer(null, "oussama", "med@gmail.com"));
			customerRepositoey.save(new Customer(null, "karim", "karim@gmail.com"));
			customerRepositoey.save(new Customer(null, "ibrahim", "ibrahim@gmail.com"));
			customerRepositoey.findAll().forEach(c->{
				System.out.println(c.toString());
			} );

		};
	}

}
