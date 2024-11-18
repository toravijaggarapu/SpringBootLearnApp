package com.webapp.WebAppSample.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
