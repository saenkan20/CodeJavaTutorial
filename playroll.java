
import java.util.Scanner;
public class playroll {
    public static void main(String[] args){
        String name;
        int hours;
        double payrate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name");
        name = keyboard.nextLine();
        System.out.print("how many hours did youe work");
        hours = keyboard.nextInt();
        System.out.print("What is your hours Payrate");
        payrate = keyboard.nextDouble();
        grossPay = hours * payrate;
        System.out.print("Hello"+name);
        System.out.print("Your grossPay is"+grossPay);


    }
}
