public class TestFor {
    public static void main(String[] args) {
        int multiplier = 2; 
        int range = 10; 
        System.out.println("Multiplication Table for " + multiplier);
        for (int i = 1; i <= range; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}
