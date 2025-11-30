import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    private final int customer_id;
    private ArrayList<String> orders;
    private final String restoName;

    Customer(int customer_id, String restaurant) {
        this.customer_id = customer_id;
        this.orders = new ArrayList<>();
        this.restoName = restaurant;
        System.out.println("WELCOME TO " + this.restoName +", NEW CUSTOMER!");
    }

    void orderFood(String order){
        this.orders.add(order);
        System.out.println("Customer "+ this.customer_id + " has ordered " + order);
    }

    float calcBill(){
        float total = 0.00f;
        HashMap<String, Float> prices = Menu.getMenu();

        for(String order : this.orders) {
            total += prices.get(order);
        }
        System.out.println("The total bill amounts to: $" + String.format("%.2f",total));
        return total;
    }
    void payBill(float total){
        System.out.println("Customer " + this.customer_id + " has paid their bill amounting to $" + String.format("%.2f",total));
    }
}
