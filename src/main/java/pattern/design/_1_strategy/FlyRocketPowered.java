package pattern.design._1_strategy;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyBehavior:: FlyRocketPowered fly");
    }
}
