package strategy;

import strategy.interfaces.FlyInterface.FlyNoWay;
import strategy.interfaces.QuackInterface.Quack;

//Утка-приманка
public class ModelDuck extends Duck{
    public ModelDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

}
