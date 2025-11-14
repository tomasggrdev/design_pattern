package paterns.structural.structural.adapter;

import paterns.structural.structural.adapter.DTOs.LegacyNotificationDTO;
import paterns.structural.structural.adapter.logic.EmailNotificatorAdapter;
import paterns.structural.structural.adapter.logic.EmailService;
import paterns.structural.structural.adapter.logic.SMSNotificatorAdapter;
import paterns.structural.structural.adapter.logic.SMSService;

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
