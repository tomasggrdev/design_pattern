package paterns.structural.structural.adapter.logic;

import paterns.structural.structural.adapter.DTOs.SMSNotificationDTO;

public class SMSService {

    public void sendSMS(SMSNotificationDTO smsNotificationDTO) {
        System.out.println("Sending sms notification: " + smsNotificationDTO);
    }
}
