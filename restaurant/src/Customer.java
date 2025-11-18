import java.util.ArrayList;

public class Customer {
    int customer_id;
    ArrayList<String> orders = new ArrayList<>();

    Customer(int customer_id) {
        this.customer_id = customer_id;
        this.orders = null;
    }

    void orderFood(String order){
        this.orders.add(order);
    }

    void payBill(){
        System.out.println("Customer " + this.customer_id + "has paid their bill.");
    }
}
