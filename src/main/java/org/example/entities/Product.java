package org.example.entities;

public class Product {
    private int barCode;
    private String name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public String toString(){
        return getName();
    }
}
