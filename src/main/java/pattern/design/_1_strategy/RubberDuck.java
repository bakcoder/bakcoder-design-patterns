package pattern.design._1_strategy;

public class RubberDuck extends Duck /* implements Quackable*/{

    @Override
    public void display() {
        System.out.println("RubberDuck::display");
    }
}
