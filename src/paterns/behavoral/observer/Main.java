package paterns.behavoral.observer;

import paterns.behavoral.observer.DTOs.PublisherMessage;
import paterns.behavoral.observer.logic.publisers.PublisherABC;
import paterns.behavoral.observer.logic.subscribers.SubscriberA;
import paterns.behavoral.observer.logic.subscribers.SubscriberB;
import paterns.behavoral.observer.logic.subscribers.SubscriberC;

public class Main {

    public static void main(String[] args) {

        SubscriberA subscriberA = new SubscriberA();
        SubscriberB subscriberB = new SubscriberB();
        SubscriberC subscriberC = new SubscriberC();

        PublisherABC publisher = new PublisherABC();

        publisher.addSubscriber(subscriberA);
        publisher.addSubscriber(subscriberB);
        publisher.addSubscriber(subscriberC);

        PublisherMessage publisherMessage = new PublisherMessage("created", "file has been created");

        publisher.notify(publisherMessage);

        publisher.removeSubscriber(subscriberA);

        publisher.notify(publisherMessage);

    }
}
