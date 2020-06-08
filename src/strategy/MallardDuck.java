package strategy;

import strategy.interfaces.FlyInterface.FlyWithWings;
import strategy.interfaces.QuackInterface.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
