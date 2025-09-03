
import java.util.Scanner;

public class W09_01_Score {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Score : ");
        Byte score = kb.nextByte();

        if (score < 0 || score >100){
            System.out.println("Scores are not in the range of 0-100");
        }else{
                    if (score >= 80) {
            System.out.print("Grade A");

        }else if (score >= 70) {
            System.out.print("Grade B");

        }else if (score >= 60) {
            System.out.print("Grade C");

        }else if (score >= 50 ) {
            System.out.print("Grade D");

        }else if (score >= 0-49) {
            System.out.println("Grade F");

        }else {
            System.out.println("Error");
        }


        }



        kb.close();
    }
}
