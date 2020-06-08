package Decorator.Kofe;

public class KofeMain {
    public KofeMain(){
        Espresso es = new Espresso();
        Beverage beverage = new Mocha(es);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription());
    }
}
