package Loop;
import java.util.Scanner;
public class W11_02_While_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        byte num1 = kb.nextByte();
        System.out.print("Enter Number2: ");
        byte num2 = kb.nextByte();


        //แสดงเมนูเพื่อรับchoice
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println(" ");
        System.out.println("1. Addition");
        System.out.println(" ");
        System.out.println("2. Subtraction");
        System.out.println(" ");
        System.out.println("3. Exit");
        System.out.println(" ");
        System.out.println("==================================");


        while (true) {
            System.out.print("Enter your choice: ");
            int choice = kb.nextInt();
            System.out.println(" ");
            System.out.println("==================================");

            if (choice == 3) {
                System.out.println(" Exit Program. Bye! ");
                System.out.println(" ");
                System.out.println("==================================");
                break;
            }else if (choice == 2 ) {
                int rs = num1-num2;
                System.out.println("Subtraction = " + rs  );
                System.out.println(" ");
                System.out.println("==================================");
                break;
            }else if (choice == 1 ) {
                int result = num1+num2;
                System.out.println(" Addition = " + result );
                System.out.println(" ");
                System.out.println("==================================");
                break;
            }else  {
                System.out.println("Your choice it's not found. try again.");
                System.out.println(" ");
                System.out.println("=================================");
            }

        }

    }
}
