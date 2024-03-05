package org.example.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> listItem = new ArrayList<>();

    public void addList(Item item){
        for(Item i : listItem){
            if(i.getProduct().equals(item.getProduct())){
               i.setQuantity( i.getQuantity() + item.getQuantity());
               if(!i.getValueOfUnit().equals(item.getValueOfUnit())){
                   i.setValueOfUnit(item.getValueOfUnit());
               }
            }
            listItem.add(item);
        }
    }

    public boolean removeItem(Product product){
        return listItem.removeIf(x -> x.getProduct() == product);
    }

    public boolean removeItem(int position){
        Item itemRemoved = listItem.remove(position);

        return listItem.contains(itemRemoved);
    }

    public BigDecimal getTotal(){
        BigDecimal total = new BigDecimal("0");
        for(Item item : listItem){
            total.add(item.getTotal());
        }
        return total;
    }
}
