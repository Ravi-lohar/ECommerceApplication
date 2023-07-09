package com.example.EcommerceProject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId ;
    private String addressName ;
    private String landmark ;
    private String phoneNumber ;
    private String zipCode ;
    private String state ;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user ;

}
