public class Age {
    public static void main(String args[]){
        final int Age = 20;
        int inputAge;
        System scan = new Scanner(System.in);
        System.out.print("enter your Age");
        inputAge = scan.nextInt();
        System.out.print(("your entered"+inputAge));
        if ( inputAge < 20)
            System.out.print("you are still young");
            System.out.print("gooodbye");

    }
}
