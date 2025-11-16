package paterns.behavoral.observer.logic.subscribers;

import paterns.behavoral.observer.DTOs.PublisherMessage;

public class SubscriberB implements Subscriber{

    @Override
    public void update(PublisherMessage publisherMessage) {
        System.out.println( "SubscriberB performing message: " + publisherMessage);
    }

}
