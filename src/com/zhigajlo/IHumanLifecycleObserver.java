package com.zhigajlo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IHumanLifecycleObserver {

    void onBirth(LocalDateTime birthDateTime,
                 boolean gender,
                 double height,
                 double weight,
                 String location
    );

    void onKindergarten(String numbGroup, int numbKindergarten);

    void onSchool(int age, String numbClasses);

    void onSchoolProm(boolean schoolCertificate, LocalDateTime timeStartSchoolProm, String address);

    void onUniversity(int rating, String nameUniversity, LocalDate dateStartEducation);

    void onFamily(boolean gender, LocalDate weddingDate, String address, String nameRestaurant, String secondHalf);

    void onMyChild(String gender, LocalDateTime dateOfBirth, double height, float weight);

    void onDeath(boolean yesOrNot, LocalDateTime dateTime);

}
