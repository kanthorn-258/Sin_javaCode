import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //สร้างอ็อบเจ็ค Scanner เพื่อรับข้อมูลจากผู้ใช้

        //input base and height of triangle
        System.out.print("Enter base = ");//แสดงข้อความให้ผู้ใช้ป้อนข้อมูลฐานของรูปสามเหลี่ยม
        int base = kb.nextInt();//รับบข้อมูลฐานจากผู้ใช้ที่กรอกผ่านคีย์บอร์ดเป็นตัวเลขจำนวนเต็ม
        System.out.print("Enter height = ");
        int height = kb.nextInt();

        //Calculate area of triangle
        double area = 0.5* base* height; //หรือใส่ float ก็ได้
        System.out.println("Area of Triangle =" + area);

        kb.close(); //ปิด Sanner เพื่อกันเครื่องเต็ม
    }
}