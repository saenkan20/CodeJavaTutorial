public class DeepAndDepper {
    public static void main(String[] args){
        System.out.println("i am starting in main");
        deep();
        System.out.println("i a back in main");
    }
    public static void deep() {
        System.out.println("i a now in deep");
        deeper();
        System.out.println("i a back in deep");
    }
    public static void deeper() {
        System.out.println("i a now in deepr");
    }
}