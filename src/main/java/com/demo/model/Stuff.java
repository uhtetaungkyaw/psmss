package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stuff {
    protected int id;
    protected String name;
    protected String description;
    protected int quantity;
    protected String location;

    public Stuff(String name, String description, int quantity, String location) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.location = location;
    }
}