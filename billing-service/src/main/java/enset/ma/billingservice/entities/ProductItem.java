package enset.ma.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import enset.ma.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity;
    private double price;
    private long productID;
    @ManyToOne
    @JsonProperty(access =JsonProperty.Access.WRITE_ONLY )
    private Bill bill;
    @Transient
    private Product product;
}
