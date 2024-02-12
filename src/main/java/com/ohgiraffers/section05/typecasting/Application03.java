package com.ohgiraffers.section05.typecasting;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */

        /* 필기.
        *   자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        *   다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리가 된다.
        * */

        int inum = 10;
        long lnum = 100;

        int isum = (int) (inum + lnum);
        System.out.println("isum = " + isum);
        // 함께 가로 처리_(int) (inum + lnum);       // 110이 나옴

        /* 목차. 1. long 형태의 값을 int 형으로 강제 형변환한다. */
        int isum2 = inum + (int) lnum;
        // 부분 강제형변환 가능하다는 말이다. (int)lnum
        System.out.println("isum2 = " +inum+ lnum);
        System.out.println("isum2 = " +(inum+lnum));
        // 가로 안치면, 문자열 흡수되어 10100이 나옴
        // 가로 하면, 계산되어 계산되어 110이 나옴

    }
}
