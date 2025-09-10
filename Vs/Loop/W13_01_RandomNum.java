package Loop;

import java.util.Random;
import java.util.Scanner;
public class W13_01_RandomNum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random ran = new Random();

        int ans = ran.nextInt(10)+1;

        // System.out.println("สิ่งที่ถูกต้องคือ: "+ans);

        int igusee = 0;
        boolean win = false;

        while (igusee < 3) { 
            System.out.print("1-10 Guess it. My number : ");
            int guess = kb.nextInt();

            if (ans == guess) {
                System.out.println("Your are Albert Einstein");
                System.out.println("=================You Win=================");
                win=true;
                break;
            }else{
                System.out.println("You Wrong! Try again!");
                System.out.println("=================You Lose=================");
            }
            igusee++;
        }
        if (win == false) 
            System.out.println("That is easy. Why you don't know it. The answer is: "+ ans);
        kb.close();
    }
}
