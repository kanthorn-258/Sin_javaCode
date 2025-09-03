import java.util.Scanner; //

public class W06_01_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าวินาทีจากผู้ใช้
        System.out.print("กรอกจำนวนวินาทีทั้งหมด: ");
        int totalSeconds = scanner.nextInt();

        // คำนวณชั่วโมง นาที และวินาที
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // แสดงผลลัพธ์
        System.out.print(totalSeconds + " วินาที มีค่าเท่ากับ " 
            + hours + " ชั่วโมง " 
            + minutes + " นาที " 
            + seconds + " วินาที");

        scanner.close();
    }
}



