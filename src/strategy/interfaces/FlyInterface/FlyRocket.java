package strategy.interfaces.FlyInterface;

public class FlyRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Огонь из задницы, я лечу на встречу диким уткам!");
    }
}
