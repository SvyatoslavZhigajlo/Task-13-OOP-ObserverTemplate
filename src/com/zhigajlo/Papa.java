package com.zhigajlo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Papa implements IHumanLifecycleObserver {
    final String familyMember = "Papa";

    @Override
    public void onBirth(LocalDateTime birthDateTime,
                        boolean gender,
                        double height,
                        double weight,
                        String location) {
        if (gender) {
            System.out.println("\t" + familyMember + ": \"Ура у меня родился богатырь!!! Весом " + weight + " кг\"");
        } else {
            System.out.println("\t" + familyMember + ": \"Ура я отец принцессы!!!\" ");
        }
    }

    @Override
    public void onKindergarten(String numbGroup, int numbKindergarten) {
        if (numbGroup != null) {
            System.out.println("\t" + familyMember + ": \"Жена начнет зарабатывать :)\"");
        }
    }

    @Override
    public void onSchool(int age, String numbClasses) {
        System.out.println("\t" + familyMember + ": \"Первоклассник\" ");
    }

    public void onSchoolProm(boolean schoolCertificate,
                             LocalDateTime timeStartSchoolProm,
                             String address) {
        final String administrationOfSchool = "Директор";
        if (schoolCertificate) {
            System.out.println("Уважаемый(ая) " + familyMember +
                    ", приглашаем вас на выпускной вечер!!" + ",который пройдет по адресу " + address + " в " +
                    timeStartSchoolProm + "\nС уважением, " + administrationOfSchool);
        } else {
            System.out.println("Уважаемый(ая) " + familyMember +
                    ",Ваш ребенок не здал ЗНО" + "\nС уважением, " + administrationOfSchool);
        }

    }

    @Override
    public void onUniversity(int rating, String nameUniversity, LocalDate dateStartEducation) {
        final String administrationUniversity = "Директор";
        System.out.println("Ваш ребенок набрал" + rating + "баллов" + " и зачислен на 1й курс в " + nameUniversity +
                "\nСтарт обучения - " + dateStartEducation +
                "\nС уважением, " + administrationUniversity);
    }

    @Override
    public void onFamily(boolean gender,
                         LocalDate weddingDate,
                         String address,
                         String nameRestaurant,
                         String secondHalf) {
        System.out.println(familyMember + "Я и " + secondHalf +
                "решили поженится, приглашаем тебя на свадьбу, которая состоится " + weddingDate + "в " +
                nameRestaurant + "по адресу " + address);
    }

    @Override
    public void onMyChild(String gender, LocalDateTime dateOfBirth, double height, float weight) {
        System.out.println(familyMember + ": Родился наследник :) ");
    }

    @Override
    public void onDeath(boolean yesOrNot, LocalDateTime dateTime) {
        if (yesOrNot){
            System.out.println(familyMember + " :( ");
        }else {
            System.out.println("good good");
        }
    }
}
