package pattern.design._1_strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QuackBehavior:: Quack quack");
    }
}
