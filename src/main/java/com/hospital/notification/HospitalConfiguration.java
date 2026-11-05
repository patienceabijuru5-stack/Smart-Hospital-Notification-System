
package com.hospital.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospitalConfiguration {

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET:}")
    private String hospitalApiSecret;

    public String getHospitalName() {
        return hospitalName;
    }

    public void displayHospitalInformation() {

        System.out.println("\n--- HOSPITAL INFORMATION ---");
        System.out.println("Hospital Name: " + hospitalName);

        if (hospitalApiSecret.isBlank()) {
            System.out.println("API Secret: NOT CONFIGURED");
        } else {
            System.out.println("API Secret: CONFIGURED");
        }
    }
}
