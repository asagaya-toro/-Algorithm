/*
백준 8393번 - 합
날짜: 2026/1/12 (월) | 소요시간: 5분

[접근 방식]
고민했던 부분은 없음
*/

// 입력: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
// 출력: 1부터 n까지 합을 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // n 변수 선언
        int n = sc.nextInt();
        int result = 0;

        // 1부터 n까지 합
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        // 출력
        System.out.println(result);
    }
}

/*
[복기]
😀 변수 종류
   지역 변수              | 메서드 / 블록 | 자동 초기화 ❌ | 공유 ❌
   멤버 변수 (= 필드, 인스턴스 변수) | 클래스       | 자동 초기화 ⭕ | 공유 ❌
   static 변수            | 클래스       | 자동 초기화 ⭕ | 공유 ⭕
*/
