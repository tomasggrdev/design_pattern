package paterns.structural.behavoral.observer.logic.subscribers;

import paterns.structural.behavoral.observer.DTOs.PublisherMessage;

public interface Subscriber {

    void update(PublisherMessage publisherMessage);
}
