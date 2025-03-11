package pattern.design._1_strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyBehavior:: FlyWithWings fly");
    }
}
