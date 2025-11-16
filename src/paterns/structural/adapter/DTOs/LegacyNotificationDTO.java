package paterns.structural.adapter.DTOs;

public class LegacyNotificationDTO {

    private String title;
    private String email;
    private String phone;
    private String message;

    public LegacyNotificationDTO(String title, String email, String phone, String message) {
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LegacyNotificationDTO{" +
                "title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
