import java.util.Scanner;

public class ifAct {
    public static void main(String[] args) {
        // สร้างตัวแปร Scanner เพื่อรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // ขอให้ผู้ใช้ป้อนคะแนน
        System.out.print("Enter your score: ");
        int score = scanner.nextInt(); // รับค่าคะแนนเป็นจำนวนเต็ม

        // เปรียบเทียบคะแนนและแสดงผลลัพธ์
        if (score > 60) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }

        // ปิดตัวแปร Scanner
        scanner.close();
    }
}