package org.example.application;

import org.example.Exceptions.BarCodeEquals;
import org.example.entities.Item;
import org.example.entities.Product;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Product p1 = new Product(123, "Tv", "Grande");
            Product p2 = new Product(123, "Notebook", "Pequeno");
        }catch (BarCodeEquals e){
            System.out.println(e.getMessage());
        }

    }
}