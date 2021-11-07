package com.zhigajlo;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Human human = new Human();
        human.setObservers(new IHumanLifecycleObserver[]{
                new Mama(),
                new Papa(),
//                new GrandFather(),
//                new GrandMother()
        });
        human.life();

        IHumanLifecycleObserver humanLifecycleObserver = new IHumanLifecycleObserver() {
            @Override
            public void onBirth(OnBirthParam param) {

            }

            @Override
            public void onKindergarten(OnKindergarten parameters) {

            }

            @Override
            public void onSchool(OnSchool parameters) {

            }

            @Override
            public void onSchoolProm(OnSchoolProm parameters) {

            }

            @Override
            public void onUniversity(OnUniversity parameters) {

            }

            @Override
            public void onFamily(OnFamily parameters) {

            }

            @Override
            public void onMyChild(OnMyChild parameters) {

            }

            @Override
            public void onDeath(OnDeath parameters) {

            }
        };
    }
}
