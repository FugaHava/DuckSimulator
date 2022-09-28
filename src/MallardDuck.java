public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("Looks like a Mallard Duck");
    }
}
