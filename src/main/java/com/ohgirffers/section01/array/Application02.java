package com.ohgirffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        int[] iarr = new int [5];
        char [] carr = new char[10];

        System.out.println("iarr = " + iarr);
        System.out.println("carr = " +carr);

        /*필기.
        *  hashcode() : 주소값을 10진수로 변환하여 객체의 고유한 정수값을 반환 동일한 객체인지 비교할때 사용*/

        System.out.println("iarr = " +iarr.hashCode());
        System.out.println("carr = " +carr.hashCode());

        //스캐너를 통해 입력받은 정수로 배열 길이를 지정하여 배열 할당연습
        Scanner sc =new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        int [] iarr2 = new int [size];

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
        System.out.println("iarr2의 길이  " + iarr2.length);

        /*필기. 하지만 한번 지정한 배열의 크기는 변경 하지못함*/
        iarr2 = new int [20];

        System.out.println("수정 후 iarr2의 hashcode: " +iarr2.hashCode());
        System.out.println("수정 후 iarr2의 길이 : " +iarr2.length);


    }
}
