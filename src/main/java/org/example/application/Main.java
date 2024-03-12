package org.example.application;

import org.example.entities.Item;
import org.example.entities.Product;
import org.example.entities.ShoppingCart;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Item item1 = new Item(new Product(123,"TV", "Grande"), new BigDecimal(1000), 1);
            Item item2 = new Item(new Product(321, "microondas", "pequeno"), new BigDecimal(300), 2);
            Item item3 = new Item(new Product(123, "TV", "Grande"), new BigDecimal(500), 3);

            ShoppingCart shoppingCart = new ShoppingCart();

            shoppingCart.addList(item1);
            shoppingCart.addList(item2);

            shoppingCart.seeAll();
            System.out.println("Total = " + shoppingCart.getTotal());

            shoppingCart.addList(item3);

            shoppingCart.seeAll();
            System.out.println("Total = " + shoppingCart.getTotal());

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}