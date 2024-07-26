import java.util.Scanner;
public class CircleArea {
    public static void main(String args[]){
        double redius;
        Scanner in = new Scanner(System.in);
        System.out.print("enter redains");
        redius = in.nextDouble();
        if(redius < 0)
        System.out.print("enter redius must be >= 0");
        else{
            double area = 3.141 * redius * redius;
            System.out.println("the area is "+redius);
        }


    }
}
