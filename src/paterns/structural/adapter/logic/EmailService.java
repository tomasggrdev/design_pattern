package paterns.structural.adapter.logic;

import paterns.structural.adapter.DTOs.EmailNotificationDTO;

public class EmailService {

    public void sendEmail(EmailNotificationDTO emailNotificationDTO) {
        System.out.println("Sending email notification: " + emailNotificationDTO);
    }
}
