package paterns.structural.structural.adapter.DTOs;

public class SMSNotificationDTO {

    private String tell;
    private String message;

    public SMSNotificationDTO(String tell, String message) {
        this.tell = tell;
        this.message = message;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SMSNotificationDTO{" +
                "tell='" + tell + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
