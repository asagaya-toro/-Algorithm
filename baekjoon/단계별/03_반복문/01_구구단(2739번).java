/*
백준 2739번 - 구구단
날짜: 2026/1/10 (토) | 소요시간: 5분

[접근 방식]
크게 고민한 부분은 없음
자바에서도 자바스크립트 처럼 문자와 변수를 한 따옴표 안에 출력하고 싶음
(자바스크립트의 경우) `${n} * ${i} = ${result}`
(자바의 경우) System.out.printf("%d * %d = %d%n", n, i, result);
*/

// 입력: 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
// 출력: 출력형식과 같게 N*1부터 N*9까지 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력
        Scanner sc = new Scanner(System.in);

        // 입력받을 N 변수 선언
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            int reseult = n * i;
            System.out.println(n + " * " + i + " = " + reseult);
        }
    }
}

/*
[복기]
😀 자바 반복문 종류
   for      : 반복 횟수 고정
   while    : 종료 시점 불확실 (조건 중심)
   do-while : 무조건 한 번 실행

😀 출력문 종류
   print   : 같은 줄 출력
   println : 자동으로 줄바꿈
   printf  : 형식(format)을 지정해서 출력, 자동 줄바꿈이 없음

😀 printf 형식
   %d → 정수
   %f → 실수
   %s → 문자열
   %n → 줄바꿈
*/
