package pattern.design._1_strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyBehavior:: FlyNoWay fly");
    }
}
