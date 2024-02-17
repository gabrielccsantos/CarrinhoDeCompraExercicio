package org.example.application;

import org.example.entities.Item;
import org.example.entities.Product;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item i = new Item(new Product(123,"Tv","grande"), new BigDecimal(1000),2);


        System.out.println(i);
    }
}