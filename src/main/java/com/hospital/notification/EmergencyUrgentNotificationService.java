
package com.hospital.notification;

import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println("--- URGENT ICU ALERT ---");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
        System.out.println("Emergency notification sent successfully.");
    }
}
