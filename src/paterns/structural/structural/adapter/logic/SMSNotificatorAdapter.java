package paterns.structural.structural.adapter.logic;

import paterns.structural.structural.adapter.DTOs.LegacyNotificationDTO;
import paterns.structural.structural.adapter.DTOs.SMSNotificationDTO;

public class SMSNotificatorAdapter implements Notificator {

    private final SMSService smsService;

    public SMSNotificatorAdapter(SMSService smsService) {
        this.smsService = smsService;
    }

    @Override
    public boolean sendNotification(LegacyNotificationDTO notification) {
        SMSNotificationDTO smsNotificationDTO =
                new SMSNotificationDTO(notification.getPhone(), notification.getMessage());

        System.out.println("Sending sms notification: " + smsNotificationDTO);
        return true;
    }
}
