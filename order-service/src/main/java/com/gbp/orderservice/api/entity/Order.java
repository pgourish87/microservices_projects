package com.gbp.orderservice.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table( name = "ORDER_TB")
@Data
public class Order {
    @Id
    private int id;
    private String name;
    private int quantity;
    private double price;
}
