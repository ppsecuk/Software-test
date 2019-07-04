package shopping_basket_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingBasket {

    private List<Product> items;

    public ShoppingBasket(){
        items = new ArrayList<>();
    }

    public double getBalance() {
        double balance = 0.00;
        for (Iterator<Product> i = items.iterator(); i.hasNext(); ) {
            Product item = i.next();
            balance += item.getPrice();
        }
        return balance;
    }

    public void addItem(Product item){
        items.add(item);
    }

    public void removeItem(Product item)
        throws ProductNotFoundException {
            if(!items.remove(item)){
                throw  new ProductNotFoundException();
            }
        }

    public int getItemCount() {
            return items.size();
        }

     public void empty(){
         items.clear();;

    }
}
