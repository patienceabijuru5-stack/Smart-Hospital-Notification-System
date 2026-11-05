
package com.hospital.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    private final NotificationService defaultNotificationService;
    private final NotificationService emergencyNotificationService;

    @Autowired
    public PatientAlertProcessor(
            NotificationService defaultNotificationService,
            @Qualifier("emergencyService")
            NotificationService emergencyNotificationService) {

        this.defaultNotificationService = defaultNotificationService;
        this.emergencyNotificationService = emergencyNotificationService;
    }

    public void processRoutineAlert(String patientId, String message) {

        System.out.println("\nROUTINE PATIENT ALERT");

        defaultNotificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {

        System.out.println("\nEMERGENCY PATIENT ALERT");

        emergencyNotificationService.sendNotification(patientId, message);
    }
}
