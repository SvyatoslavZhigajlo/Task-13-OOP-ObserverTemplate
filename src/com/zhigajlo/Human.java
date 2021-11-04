package com.zhigajlo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Human {

    private IHumanLifecycleObserver[] observers;

    public void setObservers(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void life() {
        System.out.println("\n----------------------------------\nРождение");
        doBirth();
        System.out.println("\n----------------------------------\nДетский сад");
        doKindergarten();
        System.out.println("\n----------------------------------\nШкола");
        doSchool();
        System.out.println("\n----------------------------------\nВыпускной бал");
        doSchoolProm();
        System.out.println("\n----------------------------------\nУнивер");
        doUniversity();
        System.out.println("\n----------------------------------\nСемья");
        doFamily();
        System.out.println("\n----------------------------------\nРодился ребенок");
        doBirthMyKids();
        System.out.println("\n----------------------------------\nУмер");
        doDeath();

    }

    private void doBirth() {
        final boolean gender = (Math.random() > 0.5);
        final LocalDateTime birthTime = LocalDateTime.now();

        for (IHumanLifecycleObserver observer : observers) {
            observer.onBirth(birthTime, gender, 54, 4.2, "Харьков");
        }
    }

    private void doKindergarten() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onKindergarten("4", 163);
        }
    }

    private void doSchool() {
        final int age = 6;
        for (IHumanLifecycleObserver observer : observers) {
            observer.onSchool(age, "1A");
        }
    }

    private void doSchoolProm() {
        final boolean schoolCertificate = (Math.random() > 0.5);
        final LocalDateTime startSchoolProm = LocalDateTime.of(2021, 6, 30, 18, 0);
        final String address = "г.Харьков, пл. Свободы, 1";
        for (IHumanLifecycleObserver observer : observers) {
            observer.onSchoolProm(schoolCertificate, startSchoolProm, address);
        }

    }

    private void doUniversity() {
        final int rating = 187;
        final String nameUniversity = "ХИФ УГУФМТ";
        final LocalDate startEducation = LocalDate.of(2021, 9, 1);
        for (IHumanLifecycleObserver observer : observers) {
            observer.onUniversity(rating, nameUniversity, startEducation);
        }
    }

    private void doFamily() {
        final boolean gender = (Math.random() > 0.5);
        final LocalDate weddingDate = LocalDate.of(2025, 7, 7);
        final String secondHalf;
        final String address = "г.Харьков, пл.Независимости, 2а";
        final String nameRestaurant = "Гоп-Стоп";
        if (gender) {
            secondHalf = "Инна";
        } else {
            secondHalf = "Олег";
        }
        for (IHumanLifecycleObserver observer : observers) {
            observer.onFamily(gender, weddingDate, address, nameRestaurant, secondHalf);
        }
    }

    private void doBirthMyKids() {
        final String gender = "мужской";
        final LocalDateTime dateOfBirthMyChild = LocalDateTime.now();
        final int height = 56;
        final float weight = 4.34f;

        for (IHumanLifecycleObserver observer : observers) {
            observer.onMyChild(gender, dateOfBirthMyChild, height, weight);
        }
    }

    private void doDeath(){
        final boolean yesOrNot = (Math.random() >0.5);
        final LocalDateTime dateDeath = LocalDateTime.of(2098,1, 19, 1, 40);

        for (IHumanLifecycleObserver observer: observers){
            observer.onDeath(yesOrNot,dateDeath);
        }
    }

}
