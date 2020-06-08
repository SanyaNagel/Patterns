package strategy;

import strategy.interfaces.FlyInterface.FlyRocket;

public class strategyMain {
    public strategyMain(){
        Duck duckModel = new ModelDuck();
	    System.out.println("Муляжовая утке:");
        duckModel.performFly();
        duckModel.performQuack();

        System.out.println("Дикая утка:");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("Утка полетела, активировалась ракета у муляжа:");
        duckModel.setFlyBehavior(new FlyRocket());
        duckModel.performFly();
    }
}
