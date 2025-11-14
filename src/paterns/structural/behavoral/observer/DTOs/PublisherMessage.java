package paterns.structural.behavoral.observer.DTOs;


public class PublisherMessage {

    private String type;

    private String message;

    public PublisherMessage(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
