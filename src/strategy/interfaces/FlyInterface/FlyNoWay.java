package strategy.interfaces.FlyInterface;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
