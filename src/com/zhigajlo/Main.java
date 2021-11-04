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
    }
}
