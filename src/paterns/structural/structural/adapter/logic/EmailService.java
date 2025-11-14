package paterns.structural.structural.adapter.logic;

import paterns.structural.structural.adapter.DTOs.EmailNotificationDTO;

public class EmailService {

    public void sendEmail(EmailNotificationDTO emailNotificationDTO) {
        System.out.println("Sending email notification: " + emailNotificationDTO);
    }
}
