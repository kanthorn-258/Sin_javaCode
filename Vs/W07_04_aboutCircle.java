import java.util.Scanner;

public class W07_04_aboutCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter Choice (1=Area, 2=Circumference): ");
        int choice = scanner.nextInt();

        double result;
        if (choice == 1) {
            result = Math.PI * radius * radius;
            System.out.println("Area of Circle = " + result);
        } else if (choice == 2) {
            result = 2 * Math.PI * radius;
            System.out.println("Circumference of Circle = " + result);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}