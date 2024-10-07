package enset.ma.billingservice.web;

import enset.ma.billingservice.Repository.BillRepository;
import enset.ma.billingservice.Repository.ProductItemRepository;
import enset.ma.billingservice.entities.Bill;
import enset.ma.billingservice.feign.CustomerRestClient;
import enset.ma.billingservice.feign.ProductItemRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingRestController {
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;
    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;


    public BillingRestController(CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient, BillRepository billRepository, ProductItemRepository productItemRepository) {
        this.customerRestClient = customerRestClient;
        this.productItemRestClient = productItemRestClient;
        this.billRepository = billRepository;
        this.productItemRepository = productItemRepository;
    }

    @GetMapping(path="/fullbill/{id}")
    public Bill getBill(@PathVariable Long id){
        Bill bill=billRepository.findById(id).get();
        return bill;
    }
}
