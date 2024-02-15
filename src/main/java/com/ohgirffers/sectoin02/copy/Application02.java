package com.ohgirffers.sectoin02.copy;

public class Application02 {
    public static void main(String[] args) {

        /*수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.*/

        /*필기. 얕은복사의 활용
        *  얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경으와
        *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.*/

        String[] names = {"조평훈", "조승윤" ,"이순신"};

        /*필기. 얕은 복사 확인을 위한 hashcode 출력*/
        System.out.println("names의 hashcode : " +names.hashCode());

        /*목차. 1. 인자와 매개변수로 활용*/
        print(names);  //메소드 , 위에서 만든 name 배열을 가지고감

        /*목차. 2. 리턴값으로 활용*/
        String[] animals = getAnimals();  // 앙어렵
        System.out.println("리턴 받은 animals의 hashCode : " +animals.hashCode());

        print(animals);

    }
    public static void print(String[] sarr){  //()안 매개변수 ,String[] sarr = name 위에서 받음

        /*필기. 전달받은 배열의 hashCode 출력*/
        System.out.println("sarr의 hashcode : " +sarr.hashCode());

        /*필기. 전달받은 배열의 값 출력*/
        for(int i = 0; i < sarr.length; i++){
            System.out.println(sarr[i]);
        }

        System.out.println();

    }
    public static String[] getAnimals() {

        String[] animals = new String[] { "낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;
    }


}
