package lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String channelName;
    private List<Observer> observers;
    private String latestVideoTitle;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;

        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(latestVideoTitle);
        }
    }

    public void uploadVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("{" + channelName + "} uploaded a new video: " + title);
        notifyObservers();
    }

}