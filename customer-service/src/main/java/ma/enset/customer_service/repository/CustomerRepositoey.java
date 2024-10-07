package ma.enset.customer_service.repository;

import ma.enset.customer_service.entities.Customer;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepositoey extends JpaRepository<Customer, Long> {

}
