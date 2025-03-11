package pattern.design._1_strategy;

public class DuckMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.display();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
