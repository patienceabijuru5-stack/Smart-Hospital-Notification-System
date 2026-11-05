
package com.hospital.notification;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println("--- EMAIL NOTIFICATION ---");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
        System.out.println("Email notification sent successfully.");
    }
}
