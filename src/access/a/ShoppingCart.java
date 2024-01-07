package access.a;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item) {
        if (validator()) {
            System.out.println("장바구니가 가득 찼습니다. ");
            getItems();
            return;
        }
        itemList.add(item);
    }

    private boolean validator() {
        if (itemList != null) {
            return itemList.size() >= 5;
        }
        return false;
    }

    private void getItems() {
        System.out.println("장바구니에 담은 아이템입니다.");
        for (Item item : itemList) {
            System.out.print(item.name + " / ");
        }
    }
}
