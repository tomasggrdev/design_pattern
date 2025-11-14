package paterns.structural.behavoral.observer.logic.subscribers;

import paterns.structural.behavoral.observer.DTOs.PublisherMessage;

public class SubscriberA implements Subscriber{

    @Override
    public void update(PublisherMessage publisherMessage) {
        System.out.println( "SubscriberA performing message: " + publisherMessage);
    }

}
