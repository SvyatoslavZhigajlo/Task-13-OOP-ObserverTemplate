package com.zhigajlo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mama implements IHumanLifecycleObserver {
    final String familyMember = "Mama";

    @Override
    public void onBirth(OnBirthParam param) {
        if (param.gender) {
            System.out.println("\t" + familyMember + ": \" Ура я мать сына, ростом " + param.height + " см\"");
        } else {
            System.out.println("\t" + familyMember + ": \"Ура у меня дочка, ростом " + param.height + " см\"");
        }
    }

    @Override
    public void onKindergarten(OnKindergarten parameters
//            String numbGroup, int numbKindergarten
    ) {
        if (parameters.numbGroup != null) {
            System.out.println("\t" + familyMember + ": \"Ребенок в саду, у меня куча свободного времени\"");
        }
    }

    @Override
    public void onSchool(OnSchool parameters
//                      int age,String numbClasses
    ) {
        System.out.println("\t" + familyMember + ": \"Успехов в учебе\"");
    }

    @Override
    public void onSchoolProm(OnSchoolProm parameters
//            boolean schoolCertificate,LocalDateTime timeStartSchoolProm,String address
    ) {
        final String administrationOfSchool = "Директор";
        if (parameters.schoolCertificate) {
            System.out.println("Уважаемый(ая) " + familyMember +
                    ", приглашаем вас на выпускной вечер!!" + ",который пройдет по адресу " + parameters.address + " в " +
                    parameters.timeStartSchoolProm + "\nС уважением, " + administrationOfSchool);
        } else {
            System.out.println("Уважаемый(ая) " + familyMember +
                    ",Ваш ребенок не здал ЗНО" + "\nС уважением, " + administrationOfSchool);
        }

    }

    @Override
    public void onUniversity(OnUniversity parameters
//            int rating, String nameUniversity, LocalDate dateStartEducation
    ) {
        final String administrationUniversity = "Директор";
        System.out.println("Ваш ребенок набрал" + parameters.rating + "баллов" + " и зачислен на 1й курс в " +
                parameters.nameUniversity +
                "\nСтарт обучения - " + parameters.dateStartEducation +
                "\nС уважением, " + administrationUniversity);
    }

    @Override
    public void onFamily(OnFamily parameters
//            boolean gender,LocalDate weddingDate,String address,String nameRestaurant,String secondHalf
    ) {

        System.out.println(familyMember + "Я и " + parameters.secondHalf +
                "решили поженится, приглашаем тебя на свадьбу, которая состоится " + parameters.weddingDate + "в " +
                parameters.nameRestaurant + "по адресу " + parameters.address);
    }

    @Override
    public void onMyChild(OnMyChild parameters
//            String gender, LocalDateTime dateOfBirth, double height, float weight
    ) {
        System.out.println(familyMember + ": Я бабушка!!!");
    }

    @Override
    public void onDeath(OnDeath parameters
//            boolean yesOrNot, LocalDateTime dateTime
    ) {
        if(parameters.yesOrNot){
            System.out.println(familyMember + " :(");
        }else{
            System.out.println( familyMember + "Не сегодня");
        }
    }


}
