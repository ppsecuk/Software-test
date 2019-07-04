package shopping_basket_example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    private ShoppingBasket shoppingBasket;
    private Product product;

    @Before
    public void  setUp() throws Exception{
        shoppingBasket = new ShoppingBasket();
        product = new Product("Jacket", 10.0, "00001X01030102");
        shoppingBasket.addItem(product);
    }

    @Test
    public void testWhenEmptyShoppingBasketThenNoItems(){
        shoppingBasket.empty();
        assertEquals(0, shoppingBasket.getItemCount());
    }

    @Test
    public void testWhenAddItemThenRightBalance(){
        Product tshirt = new Product("Tshirt", 29.99, "0101020203030XXX");
        shoppingBasket.addItem(tshirt);

        assertEquals(2,shoppingBasket.getItemCount());

        double expectedBalance = product.getPrice() + tshirt.getPrice();
        assertEquals(expectedBalance, shoppingBasket.getBalance(), 0);
    }

    @Test
    public void testWhenRemoveItemThenNoitem(){
        shoppingBasket.removeItem(product);
        assertEquals(0, shoppingBasket.getItemCount());
    }

    @Test (expected = ProductNotFoundException.class)
    public void testWhenRemoveItemNotInCartThenThrow(){
        Product skirt = new Product("Skirt", 19.00, "0248325757759393");
        shoppingBasket.removeItem(skirt);
    }

}