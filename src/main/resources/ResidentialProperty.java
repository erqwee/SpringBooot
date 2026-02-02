package com.example.springbooot;

import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class ResidentialProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private double price;
    private int rooms;

    public ResidentialProperty() {}

    public ResidentialProperty(String address, double price, int rooms) {
        this.address = address;
        this.price = price;
        this.rooms = rooms;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getRooms() { return rooms; }
    public void setRooms(int rooms) { this.rooms = rooms; }
}