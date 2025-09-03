import java.util.Scanner;
public class W05_01_inputData {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Value A = ");
        int a =kb.nextInt();
        System.out.print("Enter Value B = ");
        int b =kb.nextInt();

        System.out.println(" Before : Output of Value A = " + a);
        System.out.println(" Before : Output of Value B = " + b);

        //swap values
        int temp = a;
        a = b;
        b = temp;


        System.out.println(" After : Output of Value A = " + a);
        System.out.println(" After : Output of Value B = " + b);

        int x = 0;
        System.out.println( x-- + ++x - --x - x-- + x++ + x );
    }
}
