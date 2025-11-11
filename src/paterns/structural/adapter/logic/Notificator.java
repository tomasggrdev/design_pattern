package paterns.structural.adapter.logic;

import paterns.structural.adapter.DTOs.LegacyNotificationDTO;

public interface Notificator {

    boolean sendNotification(LegacyNotificationDTO notification);
}
