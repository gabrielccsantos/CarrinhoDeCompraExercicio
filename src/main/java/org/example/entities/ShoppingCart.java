package org.example.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> listItem;


    public ShoppingCart(){
        listItem = new ArrayList<>();
    }

    public void addList(Item item)throws RuntimeException{
        for(Item i : listItem){
            if(i.getProduct().equals(item.getProduct())){
                item.setQuantity(item.getQuantity() + i.getQuantity());
                listItem.remove(i);
            }
        }
        listItem.add(item);
    }

    public boolean removeItem(Product product){
        return listItem.removeIf(x -> x.getProduct() == product);
    }

    public boolean removeItem(int position){
        Item itemRemoved = listItem.remove(position);

        return listItem.contains(itemRemoved);
    }

    public BigDecimal getTotal(){
        int soma = 0;
        for(Item i : listItem){
            soma += i.getTotal().intValue();
        }

        return new BigDecimal(soma);
    }

    public void seeAll(){
        listItem.forEach(System.out::println);
    }
}
