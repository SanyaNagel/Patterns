package singleton.version1;

import singleton.version1.interfaces.Observer;
import singleton.version1.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public WeatherData(){
        displayOne a = new displayOne();
        displayTwo b = new displayTwo();
        register(a);
        register(b);
        notifyObserver();

    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); ++i){
            observers.get(i).update(i+1);
        }
    }
}
