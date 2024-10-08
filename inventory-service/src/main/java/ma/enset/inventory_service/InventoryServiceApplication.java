package ma.enset.inventory_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(new Product(null, "laptop", 1000, 5));
			productRepository.save(new Product(null, "printer", 200, 3));
			productRepository.save(new Product(null, "smartphone", 500, 7));
			productRepository.findAll().forEach(p -> {
				System.out.println(p.toString());
			});
		};
	}
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private double quantity;
}

@RepositoryRestResource
interface ProductRepository extends JpaRepository<Product, Long> {
}
