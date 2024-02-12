package com.ohgiraffers.section05.typecasting;

public class Application02 {

        public static void main(String[] args) {

            /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
            /* 필기.
            *   강제형변환
            *   바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
            *   (바꿀자료형) 값;
            * */

            /* 필기.
            *   자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
            *   1. 강제 형변환 규칙
            *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
            *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
            *   1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다.
           *        ㄴ문자는 음수가 없으니깐, sign bit로 사용하니깐 2비트보다 더 큰 공간 사용
            *   1-4. 논리형은 마찬가지로 강제 형변환 규칙에도 제외가 된다.
            * */

            /* 목차. 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.*/
            /* 목차. 1-1-1. 정수 끼리의 강제 형변환 */
            long lnum = 8;
//            int inum = lnum;
//            System.out.println("inum = " + inum);     // 데이터 손실 가능성을 컴파일러가 알려준다. (에러났음)

            int inum = (int) lnum;
            // 변경하려는 자료형을 명시하여 강제 형변환을 해야 함.
            // (int)로 변경할 자료형값을 ()하여 명시해줌, 그렇게 하면 강제형변환 가능(다만, 데이터는 손실됨)


            /* 목차. 1-1-2. 실수 끼리의 강제 형변환 */
            double dnum = 8.0;       // double= 8byte
//            float fnum = dnum;     // float = 4byte, (따라서, 큰바이트에서 작은바이트로 들어갈 수가 없음.)
            float fnum = (float) dnum;
            System.out.println("dnum = " + dnum);   // 8.0

            /*목차. 1-1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다.*/
            char ch= 'a';
            byte bnum = (byte) ch;
            // 오류 안나려면 강제적 형변환(=명시적 형변환), 변화된 부피 꼭 명시해줘야한다.
            // 'a' =97, byte= -128~127,  int= 2의 31~31,-1임

            /* 테스트 */
            int num1 = 97;
            int num2 = -97;

            char ch2 = (char) num1;   //97 =a 므로, a 나옴
            char ch3 = (char) num2;   // -97에 대한 캐릭터값 나옴, ﾟ
            System.out.println("ch2 = " + ch2);
            System.out.println("ch3 = " + ch3);
            // 음수도 문제가 없다는 걸 보여줌.


    }
}
