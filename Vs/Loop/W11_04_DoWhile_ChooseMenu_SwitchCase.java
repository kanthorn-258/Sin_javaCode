package Loop;
import java.util.Scanner;
public class W11_04_DoWhile_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
        
        //แสดงเมนูเพื่อรับchoice
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println(" ");
        System.out.println("1. Addition");
        System.out.println(" ");
        System.out.println("2. Subtraction");
        System.out.println(" ");
        System.out.println("3. Exit");
        System.out.println(" ");
        System.out.println("==================================");
        int choice;
        do { 
            System.out.println("----------------------------------");
            System.out.print("Enter your choice: ");
            choice = kb.nextInt();
            System.out.println(" ");
            System.out.println("----------------------------------");
            
            
            switch(choice) {
                case 1 :
                    System.out.print("Enter Number1: ");
                    int num1 = kb.nextByte();
                    System.out.print("Enter Number2: ");
                    int num2 = kb.nextByte();
                    int result = num1+num2;
                    System.out.println(" Addition = " + result );
                    System.out.println(" ");
                    System.out.println("==================================");
                    break;
            
                case 2 :
                    System.out.print("Enter Number1: ");
                    num1 = kb.nextByte();
                    System.out.print("Enter Number2: ");
                    num2 = kb.nextByte();
                    result = num1-num2;
                    System.out.println("Subtraction = " + result  );
                    System.out.println(" ");
                    System.out.println("==================================");
                    break;
                
                case 3 :
                    System.out.println(" Exit Program. Bye! ");
                    System.out.println(" ");
                    System.out.println("==================================");
                        break;
                    
                default :
                    System.out.println("Your choice it's not found. try again.");
                    System.out.println(" ");
                    System.out.println("=================================");
                    
            }
} while (choice != 3);
kb.close();
                }
            }