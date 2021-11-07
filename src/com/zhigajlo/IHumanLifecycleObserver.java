package com.zhigajlo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IHumanLifecycleObserver {

    void onBirth(OnBirthParam param);
    class OnBirthParam{
        LocalDateTime birthDateTime;
        boolean gender;
        double height;
        double weight;
        String location;

        public OnBirthParam(LocalDateTime birthDateTime, boolean gender, double height, double weight, String location) {
            this.birthDateTime = birthDateTime;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
            this.location = location;
        }
    }

    void onKindergarten(OnKindergarten parameters);
    class OnKindergarten{
        String numbGroup;
        int numbKindergarten;

        public OnKindergarten(String numbGroup, int numbKindergarten) {
            this.numbGroup = numbGroup;
            this.numbKindergarten = numbKindergarten;
        }
    }

    void onSchool(OnSchool parameters);
    class OnSchool{
        int age;
        String numbClasses;

        public OnSchool(int age, String numbClasses) {
            this.age = age;
            this.numbClasses = numbClasses;
        }
    }

    void onSchoolProm(OnSchoolProm parameters);
    class OnSchoolProm {
        boolean schoolCertificate;
        LocalDateTime timeStartSchoolProm;
        String address;

        public OnSchoolProm(boolean schoolCertificate, LocalDateTime timeStartSchoolProm, String address) {
            this.schoolCertificate = schoolCertificate;
            this.timeStartSchoolProm = timeStartSchoolProm;
            this.address = address;
        }
    }

    void onUniversity(OnUniversity parameters);
    class OnUniversity{
        int rating;
        String nameUniversity;
        LocalDate dateStartEducation;

        public OnUniversity(int rating, String nameUniversity, LocalDate dateStartEducation) {
            this.rating = rating;
            this.nameUniversity = nameUniversity;
            this.dateStartEducation = dateStartEducation;
        }
    }

    void onFamily(OnFamily parameters);
    class OnFamily{
        boolean gender;
        LocalDate weddingDate;
        String address;
        String nameRestaurant;
        String secondHalf;

        public OnFamily(boolean gender, LocalDate weddingDate, String address, String nameRestaurant, String secondHalf) {
            this.gender = gender;
            this.weddingDate = weddingDate;
            this.address = address;
            this.nameRestaurant = nameRestaurant;
            this.secondHalf = secondHalf;
        }
    }

    void onMyChild(OnMyChild parameters);
    class OnMyChild{
        String gender;
        LocalDateTime dateOfBirth;
        double height;
        float weight;

        public OnMyChild(String gender, LocalDateTime dateOfBirth, double height, float weight) {
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.height = height;
            this.weight = weight;
        }
    }

    void onDeath(OnDeath parameters);
    class OnDeath{
        boolean yesOrNot;
        LocalDateTime dateTime;

        public OnDeath(boolean yesOrNot, LocalDateTime dateTime) {
            this.yesOrNot = yesOrNot;
            this.dateTime = dateTime;
        }
    }

}
