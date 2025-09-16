import java.util.Scanner;

public class W14_OddEvenNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int start, end;
        
        do{
            
            System.out.print("Enter start value: ");
            start = kb.nextInt();
            System.out.print("Ennter end value: ");
            end = kb.nextInt();

            if (start>=end) {
            System.out.println("Start value must be less than end value. Please enter again.");
            System.out.println("========================================================================================"); 
            }   
        }while(start>=end);

        int i = start;

        do{
            if(i % 2 == 0){
                System.out.println(i+" "+"is an even number");
            }else{
                System.out.println(i+" "+"is an odd number");
            }i++;
        }while (i<=end);
    }
}