public class Ex5_2 {

    public static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        System.out.println("Calculating x^3 for x from 1 to 10:");

        for (int x = 1; x <= 10; x++) {
            int result = cube(x);
            System.out.printf("%d^3 = %d%n", x, result);
        }
    }
}