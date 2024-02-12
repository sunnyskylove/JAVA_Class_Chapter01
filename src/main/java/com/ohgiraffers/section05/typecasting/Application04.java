package com.ohgiraffers.section05.typecasting;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 형변환 시 주의할 점을 이해하고 사용할 수 있다. */
        /* 필기.
        *   형변환 사용시 주의할 점
        *   데이터 손실에 유의해서 사용해야 한다.!!!!!!!!!
        * */

        /* 목차. 1. 의도하지 않은 데이터 손실 */
        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum = " + inum);   // 큰 int값 출력했을때 정상으로 나옴
        System.out.println("bnum = " + bnum);   // 작은 byte값으로 강제형변환하고 출력시 데이터 손상됨 알 수 있다.
        // bnum에서 데이터 손실된 내역 확인할 수 있다. (290->34)


        /* 목차. 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorheight = (int)height;

        System.out.println("height = " + height);
        System.out.println("floorheight = " + floorheight); // 소수점 절삭에 이용할 수 있다. (175.5 -> 175)

    }
}
