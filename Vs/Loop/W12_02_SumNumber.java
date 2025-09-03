package Loop;

import java.util.Scanner;

public class W12_02_SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int start,stop;
        do{
            // System.out.println("มึงบ้ารึป่าวว่ะไอ่ชาย");
            System.out.print("enter your start number: ");
            start = kb.nextInt();
            System.out.print("enter your stop number: ");
            stop = kb.nextInt();
            int sum = 0;
            int round = 1;
            if(start<stop){
                for (int count = start; count <= stop; count++) {
                    System.out.println("No." + round +" "+ sum+ "+" + count + "=" + (sum+count));
                    sum = sum=count;
                    round++;
                }
            }else{
            System.out.println("มึงบ้ารึป่าวว่ะไอ่ชาย");
            }
        }while(start>=stop);
    }
}