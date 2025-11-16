package paterns.behavoral.observer.logic.subscribers;

import paterns.behavoral.observer.DTOs.PublisherMessage;

public class SubscriberA implements Subscriber{

    @Override
    public void update(PublisherMessage publisherMessage) {
        System.out.println( "SubscriberA performing message: " + publisherMessage);
    }

}
