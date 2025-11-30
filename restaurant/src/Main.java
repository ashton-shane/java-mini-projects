public class Main {
    public static void main(String[] args) {
        // open restaurant
        Restaurant ashies = new Restaurant("Ashie's");
        String restoName = ashies.getName();
        ashies.openRestaurant();

        // customer transactions
        Customer custOne = new Customer(1, restoName);
        custOne.orderFood("Pancakes");
        custOne.orderFood("Hot Chocolate");
        custOne.orderFood("Eggs with Sausage");
        float bill = custOne.calcBill();
        custOne.payBill(bill);

        // close restaurant
        ashies.closeRestaurant();
    }
}
