import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = kb.nextInt();
        int sum = number %2 ;
        if (sum == 0) {
            System.out.print("Even Number " );
        } else {
            System.out.println("Odd Number ");
        }

        kb.close();


    }
}
