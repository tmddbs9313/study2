package com.ohgirffers.sectoin02.copy;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 배열의 깊은 복사를 사용한 자바 문법을 이해하고 이를 활용할 수 있다*/
        /*필기. 깊은 복사는 원본과 복사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 주지 않는다*/

        /*두 개의 같은 값을 가지는 배열을 만들어보자 (깊은 복사)*/
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone();  // 단점 길이를 지정할 수 없음.

        /*각 배열의 인덱스에 10씩 값을 누적증가*/
        for(int i = 0; i <arr1.length; i++) {
         arr1[i] += 10;
        }  // 값 증가 (깊은복사 확인)
        for (int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();

        /*필기.
        *  항상된 for 문
        *  배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행한다.*/

        for(int i : arr2) {
            i+=10;
        }
        for (int i = 0 ; i <arr2.length; i ++){
            // 값을 더한 것 갑ㅌ은데 증가되고 있지않다. 인덱스에 접근해서 값을 변경한게 아니고 꺼낸 값을 복사해서 쓴것.
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        /*필기.
        *  주의: 항상된 for문은 배열에 인덱스에 차례로 접근할때는 편하게 사용할 수 있지만 , 값을 변경할 수 없다
        *  대신 , 변경ㄹ하는 것이 아니고 사용하는 것이 목적이라면 조금 더 편리하게 사용할 수 있다*/

        for(int i : arr2) {
            System.out.print(i+ " ");
        }
    }
}