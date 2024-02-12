package com.ohgiraffers.section05.typecasting;

public class Application01 {

    public static void main(String[] args) {

        /*  수업목표. 자동 형변환 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   데이터 형변환
        *   데이터 형변환이 필요한 이유
        *   - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        *   - 즉!!! 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        *   - 중요!! 연산자: 연산을 수행하는 기호(+,-,*,/), 피연산자: 연산자의 연산 수행 대상 (x,y같은.., 연산외 나머지)
        * */

        /* 필기.
        *    형변환의 종류와 규칙
        *   1.자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *    1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다!!!!!!!
        *    1-2. 정수는 실수로 자동 형변환이 된다.!!!! (정수+실수 = 실수)
        *    1-3. 문자형은 int형으로 자동 형변환 된다.!!!
        *    1-4. 논리형은 형변환 규칙에서 제외된다.
        * */

        /* 목차. 1. 자동형변환 규칙 테스트 */
        /* 목차. 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다. */
        /* 필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 자동으로 처리해준다.*/

        /* 목차. 1-1-1. 정수끼리의 자동 형변환 */
        byte bnum = 1;        // 1byte
        short snum = bnum;    // 2byte
        int inum = snum;      // 4byte
        long lnum = inum;     // 8byte

        int num1 = 10;
        long num2 = 20;

//        int result1 = num1 + num2;    //
//       (오류) int result1으로 결과값 나오려면 자동으로 큰 쪽 자료형인 long으로 변경후 계산하기 때문에
//       int형 변수에 값을 담을 수 없다.

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);
        // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 앟는 int-> long 변환을 자동으로 수행한다.

        
        /* 목차. 1-1-2. 실수 */
        float fnum = 4.0f;    //4byte
        double dnum = fnum;  //8byte

        double result2 = fnum + dnum;
        System.out.println("result2 = " + result2);
        // 더 큰 double로 result2 값 구했기 때문에 자동으로 형변환 된다.
        
        
        /* 목차. 1-2. 정수는 실수로 자동 형변환이 된다.*/
        /* 필기. 
            정수를 실수로 변경할 때 소수점 자리가 없어도 실수형태로 표현이 가능하다.
            이때 데이터 손실!!!!!!이 없기 때문에 자동으로 진행한다.
            */
        
        long eight = 8;          //정수 8byte
        float four = eight;     //실수 4byte
        System.out.println("four = " + four);
        // 따라서 four = 8.0 이 나옴


        /* 목차. 1-3. 문자형은 int형으로 자동 형변환이 된다. */
        char ch1 = 'a' ;
        int charNumber = ch1;
        System.out.println("charNumber = " + charNumber);
        // 문자가 int형으로 해서 정수로 자동 형변환된다.
        System.out.println("charNumber + charNumber");

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
        // ch2 = A(아스키코드65번째)가 됨, int 형의 최대값보다 작아서 ok!
        // 반대로, 숫자를 지정하고 출력할때는 문자(아스키코드)로 형변환 되어서 나옴
        // "숫자가 아닌 문자형에 숫자형이 들어갈 수 있다"는거 보여줌. 밀접하게 연관되어 있다.


        /* 목차. 1-4. 논리형은 형변환 규칙에서 제외된다. */
        /* 필기. 어느 자료형이든 boolean 을 형변환 해서 담을 수 없다. */
//        boolean isTrue = true;
//        byte b = isTrue;
//        float f = isTrue;
//        char C = isTrue;
//        String s = isTrue;








        







    }
}
