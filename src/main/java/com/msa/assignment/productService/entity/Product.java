package com.msa.assignment.productService.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
    @Column(name="price", nullable=false)
    private Float price;

    public Product(){

    }

    public Long getId(){
        return Id;
    }

    public String getname(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Float getPrice(){
        return price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setPrice(Float price){
        this.price=price;
    }

}

