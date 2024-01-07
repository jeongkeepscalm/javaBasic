package access.b;

import access.a.Item;
import access.a.ShoppingCart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("aaa", 1000, 4);
        Item item2 = new Item("bbb", 1000, 4);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item2);

    }
}
