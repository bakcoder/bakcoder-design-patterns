package pattern.design._1_strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QuackBehavior:: Squeak quack");
    }
}
