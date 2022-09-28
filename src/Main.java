public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}