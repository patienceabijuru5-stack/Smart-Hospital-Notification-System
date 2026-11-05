package com.hospital.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartHospitalNotificationSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                SmartHospitalNotificationSystemApplication.class,
                args
        );
    }

    @Bean
    public CommandLineRunner run(
            PatientAlertProcessor processor,
            HospitalConfiguration configuration) {

        return args -> {

            System.out.println("================================");
            System.out.println("SMART HOSPITAL NOTIFICATION SYSTEM");
            System.out.println("================================");

            configuration.displayHospitalInformation();

            processor.processRoutineAlert(
                    "P001",
                    "Your hospital appointment is tomorrow."
            );

            processor.processEmergencyAlert(
                    "P002",
                    "Critical ICU alert. Immediate medical attention required."
            );

            System.out.println("\nAPPLICATION STARTED SUCCESSFULLY");
        };
    }
}
