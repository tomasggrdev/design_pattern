package paterns.structural.behavoral.observer.logic.publisers;

import paterns.structural.behavoral.observer.DTOs.PublisherMessage;
import paterns.structural.behavoral.observer.logic.subscribers.Subscriber;

public interface Publisher {

    void notify(PublisherMessage publisherMessage);

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);
}
