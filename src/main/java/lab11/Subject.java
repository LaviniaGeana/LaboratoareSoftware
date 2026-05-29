package lab11;

public interface Subject
{
    void addObserver(Observer o);

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
