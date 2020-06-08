package strategy.interfaces.FlyInterface;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly!!!!!");
    }
}
