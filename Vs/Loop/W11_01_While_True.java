package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            //No.1 รับค่าคีย์บอร์ดเป็นตัวเลข ถึงเลข 9 จะหยุด
            //System.out.print("enter number: ");
            //int num = kb.nextInt();
            //if( num == 9 ){ //คำสั่งที่ใช้ในตรวจสอบการออกจากLoop
                //break; //คำสั้งที่ใช้ออกจากloop

            //}




            //No.2 รับค่าคีย์บอร์ดเป็นตัวอักษร ตัวE จะหยุด
            System.out.println("enter alphabet: ");
            String alphabet = kb.nextLine();
            if(alphabet.equals("e")) {
                break;
            }
        }

    }
}
