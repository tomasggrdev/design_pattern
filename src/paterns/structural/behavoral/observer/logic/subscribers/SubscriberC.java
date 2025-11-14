package paterns.structural.behavoral.observer.logic.subscribers;

import paterns.structural.behavoral.observer.DTOs.PublisherMessage;

public class SubscriberC implements Subscriber{

    @Override
    public void update(PublisherMessage publisherMessage) {
        System.out.println( "SubscriberC performing message: " + publisherMessage);
    }

}
