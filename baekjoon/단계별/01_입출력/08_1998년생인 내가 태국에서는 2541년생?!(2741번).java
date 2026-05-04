/*
백준 2741번 - 1998년생인 내가 태국에서는 2541년생?!
날짜: 2025/12/19 (금) | 소요시간: 6분

[접근 방식]
서기와 불기의 연도 차이
변수 이름을 어떻게 선언할지,, 고민
*/

// 입력 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
// 출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int be = sc.nextInt();
        int ad = be - 543;

        // 출력
        System.out.print(ad);
    }
}

/*
[복기]
😀 불기 연도는 +544? +543?
   불기기원 : 석가모니가 입적한 해를 기준으로 삼는 연대 표기법
   서기 연도에 +544 또는 일부 국가(태국)에서는 +543을 해야 불기 연도가 된다.

   변수 선언은 어떤 변수인지 알기 쉽게 정의
   int buddhistYear
   int christianYear
*/
