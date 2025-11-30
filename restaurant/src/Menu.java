import java.util.HashMap;
import java.util.Map;

public class Menu {
    // private so it can only use the setter methods below
    private static HashMap<String, Float> menu = new HashMap<>();

    /* Using a static initialising block for the menu because I want it loaded when class is loaded.
       It would be better to put this inside the Menu constructor in the instance I have various menus
       but for now, I just want it shared with other classes.
    */
    static {
        menu.put("Pancakes", 18.50f);
        menu.put("Hot Chocolate", 7.00f);
        menu.put("Eggs with Sausage", 18.00f);
    }

    Menu(){
        // Empty constructor as no need to initialise menu.
    }

    // GETTER for menu
    public static HashMap<String, Float> getMenu(){
        return menu;
    }

    public static void addItem(String item, float price){
        menu.put(item, price);
    }

    public static void removeItem(String item){
        menu.remove(item);
    }
}
