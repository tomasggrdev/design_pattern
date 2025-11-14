package paterns.structural.behavoral.observer.logic.subscribers;

import paterns.structural.behavoral.observer.DTOs.PublisherMessage;

public class SubscriberB implements Subscriber{

    @Override
    public void update(PublisherMessage publisherMessage) {
        System.out.println( "SubscriberB performing message: " + publisherMessage);
    }

}
