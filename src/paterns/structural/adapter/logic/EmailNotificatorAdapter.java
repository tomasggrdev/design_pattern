package paterns.structural.adapter.logic;

import paterns.structural.adapter.DTOs.EmailNotificationDTO;
import paterns.structural.adapter.DTOs.LegacyNotificationDTO;

public class EmailNotificatorAdapter implements Notificator {

    private final EmailService emailService;

    public EmailNotificatorAdapter(EmailService emailService) {
        this.emailService = new EmailService();
    }

    @Override
    public boolean sendNotification(LegacyNotificationDTO notification) {
        EmailNotificationDTO emailNotificationDTO =
                new EmailNotificationDTO(notification.getEmail(), notification.getTitle(), notification.getMessage());

        emailService.sendEmail(emailNotificationDTO);
        return true;
    }
}
