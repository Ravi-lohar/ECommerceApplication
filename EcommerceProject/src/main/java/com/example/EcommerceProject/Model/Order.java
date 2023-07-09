package com.example.EcommerceProject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId ;

    private Integer productQuantity ;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user ;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product ;

    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    private Address address ;


}
