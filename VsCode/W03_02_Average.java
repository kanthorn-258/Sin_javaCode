import java.util.Scanner;
public class W03_02_Average {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 
        System.out.print("enter number1 =");
        int number1 = kb.nextInt();
        System.out.print("enter number2 =");
        int number2 = kb.nextInt();
        double average = (number1 + number2) /2 ;
        System.out.print("average =" + average);
        kb.close();
    }
}