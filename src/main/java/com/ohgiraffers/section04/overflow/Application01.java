package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args) {

       /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 필기.
        *   자료형 별 값의 최대 범위를 벗어나는 경우     // 중요!! 자료형의 최대값보다 값이 넘쳐흐를때~~
        *   발생한 carry 를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴.
            sign bit 자리를 침범하게 되면 강제로 ( + - )를 반전시킨다. */

        /*목차. 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 : " +num1);        // 127 : byte의 최대 저장범위 (기준)

        num1++;     // +1 증가
        System.out.println("num1 overflow :" + num1);   // -128: byte의 최소 저장범위 넘어서 숫자는 오르지만, 부호는 반대부호-로 변환된다.


        /* 목차. 2. 언더플로우 */
        /* 필기. 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다./ 중요! 자료형의 최소값보다 값이 적을떄~~
        *    */
        byte num2= -128;
        System.out.println("num2 : " +num2);   // -128

        num2--;   // -1 감소,
        System.out.println("num2 underflow : " +num2);  //  127 : byte의 최소범위보다 적어져서 숫자는 그대로 감소되지만, 부호는 반대부호인 +로 변환된다.
        // 따라서, -129가 아닌, 127 된다.


        int firstNum= 1000000;     //100만
        int secondNum = 700000;    // 70만

        int multi = firstNum*secondNum;

        System.out.println("firstNum * secondNum : " + multi);   // 7천억이 나오지 않고, -79669248이 된다.


        /* 목차. 3. 해결방법 */
        /* 필기. 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */

        long longMulti = firstNum * secondNum;   // 7천억
        System.out.println("longMulti; " + longMulti);   // 자료형이 달라서 안돼죠?, 아래 강제로 자동형변환시킴 / 위의 값과 같은 -79669248이 나옴

        long result = (long) firstNum * secondNum;     // 중요!! 형변환 식으로 만들어주면 곱한 결과값 제대로 나옴, long으로 형변환하겠단 이야기
        System.out.println("result :" + result);















    }
}
