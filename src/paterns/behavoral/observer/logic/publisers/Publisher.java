package paterns.behavoral.observer.logic.publisers;

import paterns.behavoral.observer.DTOs.PublisherMessage;
import paterns.behavoral.observer.logic.subscribers.Subscriber;

public interface Publisher {

    void notify(PublisherMessage publisherMessage);

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);
}
