public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Duck m = new MallardDuck();
        Duck r = new RedheadDuck();
        m.performQuack();
        m.performFly();
    }
}