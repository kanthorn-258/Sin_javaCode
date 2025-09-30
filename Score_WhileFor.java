import java.util.Scanner;

public class Score_WhileFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents;
        int passed = 0, failed = 0;

        System.out.print("Enter number of students: ");
        numStudents = sc.nextInt();
        while (numStudents <= 0) {
            System.out.print("Please enter number greater than 0: ");
            numStudents = sc.nextInt();
        }

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            int score = sc.nextInt();

            if (score >= 50) {
                System.out.println("Student " + i + " : Passed");
                passed++;
            } else {
                System.out.println("Student " + i + " : Failed");
                failed++;
            }

            System.out.println("===============================");
        }

        System.out.println("Number of students passed = " + passed + " persons");
        System.out.println("Number of students failed = " + failed + " persons");
    }
}


