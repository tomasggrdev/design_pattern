package paterns.behavoral.observer.logic.publisers;

import paterns.behavoral.observer.DTOs.PublisherMessage;
import paterns.behavoral.observer.logic.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherABC {

    private final List<Subscriber> subscribers;

    public PublisherABC() {
        this.subscribers = new ArrayList<>();
    }


    public void notify(PublisherMessage publisherMessage) {
        subscribers.forEach(subscriber -> subscriber.update(publisherMessage));
    }


    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
