package paterns.structural.adapter;

import paterns.structural.adapter.DTOs.LegacyNotificationDTO;
import paterns.structural.adapter.logic.EmailNotificatorAdapter;
import paterns.structural.adapter.logic.EmailService;
import paterns.structural.adapter.logic.SMSNotificatorAdapter;
import paterns.structural.adapter.logic.SMSService;

public class Main {
    public static void main(String[] args) {

        LegacyNotificationDTO legacyNotificationDTO =
                new LegacyNotificationDTO(
                        "muy importante",
                        "tomas@gmail.com",
                        "3176000792",
                        "mensaje muy importante");

        EmailNotificatorAdapter emailNotificatorAdapter = new EmailNotificatorAdapter(new EmailService());
        SMSNotificatorAdapter smsNotificatorAdapter = new SMSNotificatorAdapter(new SMSService());

        emailNotificatorAdapter.sendNotification(legacyNotificationDTO);
        smsNotificatorAdapter.sendNotification(legacyNotificationDTO);

    }
}
