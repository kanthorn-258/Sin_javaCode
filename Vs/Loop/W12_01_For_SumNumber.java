package Loop;

import java.util.Scanner;

public class W12_01_For_SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter your start number: ");
        int start = kb.nextInt();
        System.out.print("enter your stop number: ");
        int stop = kb.nextInt();

        while(start>=stop){
            System.out.println("มึงบ้ารึป่าวว่ะไอ่ชาย");
            System.out.print("enter your start number: ");
            start = kb.nextInt();
            System.out.print("enter your stop number: ");
            stop = kb.nextInt();
        }

        int sum = 0;
        int round = 1;

            for (int count = start; count <= stop; count++) {
                System.out.println("No." + round +" "+ sum+ "+" + count + "=" + (sum+count));
                sum = sum=count;
                round++;
            }
    }
}
