package org.example.application;

import org.example.Exceptions.BarCodeEquals;
import org.example.entities.Item;
import org.example.entities.Product;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try{
            Product p = new Product(123, "tv", "teste");
            Product p1 = new Product(10, "tv", "gelo");

            System.out.println(p.equals(p1));
        }catch (BarCodeEquals e){
            System.out.println(e.getMessage());
        }
    }
}