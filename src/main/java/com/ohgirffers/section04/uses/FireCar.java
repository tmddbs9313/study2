package com.ohgirffers.section04.uses;

public class FireCar extends Car implements Soundable{


    @Override
    public void go() {

        System.out.println("소방차가 달려갑니다!!!");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다ㅏㅏ!!");

    }

    @Override
    public void Horn() {
        System.out.println("소방차가 지나갑니다~!~~!~!다들 비키세요잉~!~!");

    }
}
