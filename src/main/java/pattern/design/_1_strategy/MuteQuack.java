package pattern.design._1_strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QuackBehavior:: MuteQuack quack");
    }
}
