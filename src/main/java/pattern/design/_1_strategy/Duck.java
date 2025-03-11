package pattern.design._1_strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void swim() {
        System.out.println("Duck::swim");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // added method
//    void fly() {
//        System.out.println("Duck::fly");
//    }

//    void quack() {
//        System.out.println("Duck::quack");
//    }
}
