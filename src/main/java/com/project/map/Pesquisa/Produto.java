package com.project.map.Pesquisa;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Produto {
    
    private String name;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "Produto{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}