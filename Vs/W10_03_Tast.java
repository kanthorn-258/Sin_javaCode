
import java.util.Scanner;

public class W10_03_Tast {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Product Name : ");
        String product = kb.nextLine();

        System.out.print("Enter Price :  ");
        double price = kb.nextDouble();

        System.out.print("Enter Quantity : ");
        double QTY = kb.nextDouble();

        double subtotal = price * QTY;
        double discount =  price * 7/100;
        double nettotal = price-discount;

        System.out.println("====================================");
        System.out.println("Product Name : " + product);
        System.out.println(" ");
        System.out.println("Unit price (Baht) : " + price);
        System.out.println(" ");
        System.out.println("Quantity : " + QTY);
        System.out.println("====================================");
        System.out.println("Subtotal : "+ subtotal);
        System.out.println(" ");
        System.out.println("Discount 7% : " + discount);
        System.out.println(" ");
        System.out.println("Nettotal : " + nettotal);
        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println("Good Luck!");
    }
}
