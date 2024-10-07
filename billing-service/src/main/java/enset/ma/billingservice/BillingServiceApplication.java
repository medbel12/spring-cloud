package enset.ma.billingservice;

import enset.ma.billingservice.Repository.BillRepository;
import enset.ma.billingservice.Repository.ProductItemRepository;
import enset.ma.billingservice.feign.CustomerRestClient;
import enset.ma.billingservice.feign.ProductItemRestClient;
import enset.ma.billingservice.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BillRepository billRepository,
                            ProductItemRepository productItemRepository,
                            CustomerRestClient customerRestClient,
                            ProductItemRestClient productItemRestClient) {
        {
            return args -> {
                Customer customer = customerRestClient.getCustomerById(1L);
                System.out.println("*******************");
                System.out.println(customer.getId());
                System.out.println(customer.getName());
                System.out.println(customer.getEmail());
            };
        }

    }
}
