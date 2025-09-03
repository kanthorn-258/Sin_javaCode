
import java.util.Scanner;

public class W09_02_BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Weight (kg) : ");
        double weight = kb.nextDouble();

        System.out.print("Enter Height (cm) : ");
        double height = kb.nextDouble();

        double bmi = weight / ( height/100 * height/100 );

        System.out.println("Your BMi Is : "+ String.format("%.2f", bmi));

        if (bmi > 40 ) {
            System.out.println("Obesity 3");
        }else if (bmi >= 35 ) {
            System.out.println("Obesity 2");
        }else if (bmi >= 30 ) {
            System.out.println("Obesity 1");
        }else if (bmi >= 25) {
            System.out.println("Overweight");
        }else if (bmi >= 18.5) {
            System.out.println("Normal weight");
        }else {
            System.out.print("Low weight");
        }
        kb.close();
    }
}
