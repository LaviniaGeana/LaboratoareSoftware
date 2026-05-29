package lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName)
    {
        this.channelName = channelName;
    }

    public void uploadVideo(String title)
    {
        System.out.println("{"+ channelName + "} uploaded a new video: " + title);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers()
    {
        for (Observer o : observers){
            o.update(channelName);

        }
    }
}