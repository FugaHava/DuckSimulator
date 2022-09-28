public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    protected void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void quack() {
        System.out.println("Quack " + this.getClass().getName());
    }

    protected void swim() {
        System.out.println("I am swimming hehe " + this.getClass().getName());
    }

    protected abstract void display();

    protected void fly() {
        System.out.println("I can fly!!! " + this.getClass().getName());
    }
}

