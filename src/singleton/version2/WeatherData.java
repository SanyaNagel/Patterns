package singleton.version2;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;

public class WeatherData implements Observable {
    private ArrayList<InvalidationListener> list = new ArrayList<InvalidationListener>();
    public WeatherData(){

    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {
        list.add(invalidationListener);
    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {
        int i = list.indexOf(invalidationListener);
        if(i >= 0){
            list.remove(i);
        }
    }
}
