public class Main {
    public static void main(String[] args) {
        Customer custOne = new Customer(1);
        custOne.orderFood("Pancakes");
        custOne.orderFood("Hot Chocolate");
        custOne.orderFood("Eggs with Sausage");
        float bill = custOne.calcBill();
        custOne.payBill(bill);
    }
}
