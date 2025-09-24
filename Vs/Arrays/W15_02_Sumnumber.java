package Arrays;
import java.util.Scanner;
public class W15_02_Sumnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a []= new double[5];
        //enter number
        for (int i = 0 ; i<a.length ; i++){
            System.out.print("Enter Number " + (i+1) + ":");
            a[i] = kb.nextDouble();
        }

        double sumAll = 0;
        double sumOdd = 0;
        double sumEven = 0;
        double average = 0;
        double max = a[0];
        double min = a[0];
        //show all number
        System.out.println("========================================================");
        System.out.println("Show all number :");
        for(int i = 0 ; i<a.length ;i++ ) {
            System.out.println("index [" + i + "] value = " + a[i]);
            sumAll += a[i];
            if(a[i] % 2 != 0) {
                sumOdd += a[i];
            }else {
                sumEven += a[i];
            }
            if(a[i]>max){
                max = a[i];
            }if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("========================================================");
        System.out.println("Sum of all number = " + sumAll);
        System.out.println("Sum of Odd nmber = " +sumOdd);
        System.out.println("Sum of Even number = " + sumEven);

        average = sumAll / a.length;
        System.out.println("Average of all number = " + average);
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);
        System.out.println("========================================================");
        kb.close();
    }
}
