package singleton.version1.interfaces;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObserver();  //Уведомление наблюдателей
}
