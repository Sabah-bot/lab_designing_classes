import java.util.ArrayList;

public class ShoppingTrolley {

    // Create a String list of shopping trolley items, called itemsList
    ArrayList<String> itemsList = new ArrayList<>();

    // Add an item to the itemsList above.
    public void addItem(String itemName) {
        itemsList.add(itemName);
    }

    // Return the size of the list of items
    public int countItems() {
        return itemsList.size();
    }

    // Check if the itemName given to the function, is in itemsList
    public boolean checkItem(String itemName) {
        if(itemsList.contains(itemName)) {
            return true;
        } else {
            return false;
        }
    }

}
