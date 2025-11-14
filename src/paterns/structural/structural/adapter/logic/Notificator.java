package paterns.structural.structural.adapter.logic;

import paterns.structural.structural.adapter.DTOs.LegacyNotificationDTO;

public interface Notificator {

    boolean sendNotification(LegacyNotificationDTO notification);
}
