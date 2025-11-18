import java.util.HashMap;

public class Menu {
    HashMap<String, float> menu = new HashMap<>();

    /* Using a static initialising block for the menu because I want it loaded when class is loaded.
       It would be better to put this inside the Menu constructor in the instance I have various menus
       but for now, I just want it shared with other classes.
    */
    {
        menu.put("Pancakes", 18.50f);
        menu.put("Hot Chocolate", 7.00f);
        menu.put("Eggs with Sausage", 18.00f);
    }

    Menu(){

    }

    void addItem(){
        menu.put();
    }

    void removeItem(){
        menu.remove();
    }
}
