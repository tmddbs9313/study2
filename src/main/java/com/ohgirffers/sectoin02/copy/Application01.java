package com.ohgirffers.sectoin02.copy;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 배열의 복사 개념중 얕은 복사에 대해 이해할 수 있다*/
        /*필기. 배열의 복사에는 크게 두 가지 종류가 있다
        *  1. 얕은 복사 : stack 에 주소만 복사 (변수만 담겨있는 주소만 복사)
        *  2. 깊은 복사 : heap 의 배열에 저장된 값을 복사(실제 값을 복사)*/

        /*필기/
        *  얕은 복사는 stack 에 저장되어있는 배열의 주소값만 복사한다는 것이다.
        *  따라서 두개의 래퍼런스 변수는 동일한 배열의 주소값을 가지고있다
        *  하나의 래퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경) 을 하면
        *  다른 래퍼런스 변수로 접근 했을 때도 동일한 배열을 가리키고 있기 떄문에 변경 된 값이 반영되어 있다.*/

        //원본 배열 생성
        int [] originArr = {1,2,3,8,5};

        //originArr에 저장된 배열의 주소를 copyArr 에도 저장해보자.
        int[]copyArr = originArr;   //얕은 복사
        //원본을 바꾸면 카피한거까지 바뀜,

        System.out.println(originArr.hashCode());  //hashcode()는 그냥 우리의 주민번호처럼 생각.
        System.out.println(copyArr.hashCode());

        for (int i = 0; i < originArr.length; i ++){
            System.out.println(originArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i<copyArr.length; i++){
            System.out.println(copyArr[i]);
        }

        copyArr[0] = 99;

        for (int i = 0; i<originArr.length; i++){
            System.out.println();

        }
        System.out.println();

        for(int i = 0; i<copyArr.length;i++){
            System.out.println(copyArr[i]);
        }








    }
}
