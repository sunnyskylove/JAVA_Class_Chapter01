package com.ohgiraffers.section05.typecasting;

public class Teamtest {

    public static void main(String[] args) {

        byte num1 = 55;
        int num2 = 12;
        long num3= num1 + num2;

        int result = (int) (num1 + num2 + num3);
        System.out.println("result = " + result);
        //1번

        char ch1 = 'U';
        int inum = ch1;
        System.out.println("inum = " + inum);
        //2번

//        char ch1 = 'U';
//        short snum = ch1;
//        System.out.println("snum = " + snum);
//        // 오류이유찾기_int


//        double dnum = 1.52;
//        int inum = 50;






















    }
}
