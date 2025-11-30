import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    int customer_id;
    ArrayList<String> orders;

    Customer(int customer_id) {
        this.customer_id = customer_id;
        this.orders = new ArrayList<>();
        System.out.println("WELCOME NEW CUSTOMER!");
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
