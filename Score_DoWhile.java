import java.util.Scanner;

public class Score_DoWhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numStudents;
        int passed = 0, failed = 0;
        int i = 1; 

        do {
            System.out.print("Enter number of students: ");
            numStudents = kb.nextInt();
        } while (numStudents <= 0);

        do {
            System.out.print("Enter score for student " + i + ": ");
            int score = kb.nextInt();

            if (score >= 50) {
                System.out.println("Student " + i + " : Passed");
                passed++;
            } else {
                System.out.println("Student " + i + " : Failed");
                failed++;
            }

            System.out.println("===============================");

            i++;
        } while (i <= numStudents);

        System.out.println("Number of students passed = " + passed + " persons");
        System.out.println("Number of students failed = " + failed + " persons");
    }
}
