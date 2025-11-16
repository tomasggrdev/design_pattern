package paterns.structural.adapter.logic;

import paterns.structural.adapter.DTOs.SMSNotificationDTO;

public class SMSService {

    public void sendSMS(SMSNotificationDTO smsNotificationDTO) {
        System.out.println("Sending sms notification: " + smsNotificationDTO);
    }
}
