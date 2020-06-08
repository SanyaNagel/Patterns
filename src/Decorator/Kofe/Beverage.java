package Decorator.Kofe;

public abstract class Beverage {
    public String description = "Unknown Beverage"; //Неизвестный напиток

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
