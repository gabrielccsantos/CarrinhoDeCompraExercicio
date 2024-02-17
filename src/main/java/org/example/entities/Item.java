package org.example.entities;

import java.math.BigDecimal;

public class Item {
    private Product product;
    private BigDecimal valueOfUnit;
    private int quantity;

    public Item(Product product, BigDecimal valueOfUnit, int quantity) {
        this.product = product;
        this.valueOfUnit = valueOfUnit;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getValueOfUnit() {
        return valueOfUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getTotal(){
        BigDecimal total = new BigDecimal(getQuantity());
        return total.multiply(getValueOfUnit());
    }

    public String toString(){
        return "Item: " + getProduct() + " " +getValueOfUnit() + " " +getQuantity() + " R$" + String.format("%.2f", getTotal());
    }
}
