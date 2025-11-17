public class Customer {
    int customer_id;
    String order;

    Customer(int customer_id) {
        this.customer_id = customer_id;
        this.order = null;
    }

    void orderFood(String order){
        this.order = order;
    }

    void payBill(){
        System.out.println("Customer " + this.customer_id + "has paid their bill.");
    }
}
