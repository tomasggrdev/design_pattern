package paterns.behavoral.observer.logic.subscribers;

import paterns.behavoral.observer.DTOs.PublisherMessage;

public interface Subscriber {

    void update(PublisherMessage publisherMessage);
}
