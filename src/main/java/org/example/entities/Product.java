package org.example.entities;

import java.util.Date;

public class Product {
    private int barCode;
    private String name;
    private Date date;
    private String describe;

    public Product(int barCode, String name,String describe) {
        this.barCode = barCode;
        this.name = name;
        this.describe = describe;
    }

    public int getBarCode() {
        return barCode;
    }

    public String getName(){
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString(){
        return "Nome do produto: " + getName() +
               "\nCodigo de barras: " + getBarCode() +
               "\nDescrição: " + getDescribe();
    }
}
