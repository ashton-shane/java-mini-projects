import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SQUARE or TRIANGLE?");
        String shape = scanner.next().strip().toUpperCase();

        if (shape.equals("SQUARE")) {
            System.out.println("Length(CM): ");
            float length = scanner.nextFloat();
            System.out.println("Breadth(CM): ");
            float breadth = scanner.nextFloat();
            float area = calc_square(length, breadth);
            System.out.println("The area of the square is " + area + " CM\u00b2");
        }
    }

    private static float calc_square(float length, float breadth) {
        return length * breadth;
    }
}
