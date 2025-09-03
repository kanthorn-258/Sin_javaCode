
import java.util.Scanner;

public class W07_02_square_root {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number to find square root : ");
        double x = kb.nextDouble();
        if(x > 0) {
            double Square = Math.sqrt(x);

        }
            System.out.println("Square root of" +" " + x + " " + "is" + " " + ( Math.sqrt(x)) );
        }


    }

