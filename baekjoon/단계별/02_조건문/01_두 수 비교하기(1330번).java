/*
백준 1330번 - 두 수 비교하기
날짜: 2025/12/30 (화) | 소요시간: 5분

[접근 방식]
크게 고민한 부분은 없음
*/

// 입력: 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
/* 출력
   A가 B보다 큰 경우에는 '>'를 출력한다.
   A가 B보다 작은 경우에는 '<'를 출력한다.
   A와 B가 같은 경우에는 '=='를 출력한다.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력 받기
        Scanner sc = new Scanner(System.in);

        // 공백으로 A와 B구분하기 위해 long 선언
        long arr[] = new long[2];

        // 공백을 기준으로 A, B 선언
        arr[0] = sc.nextLong();
        arr[1] = sc.nextLong();

        // 숫자 크기 구분 조건문
        // A가 클 경우
        if (arr[0] > arr[1]) {
            System.out.print(">");
        }
        // B가 클 경우
        else if (arr[0] < arr[1]) {
            System.out.print("<");
        }
        // A와 B 같을 경우
        else {
            System.out.print("==");
        }
    }
}

/*
[복기]
😀 입력되는 숫자의 범위가 매우 크다면(약 21억 이상) long을 사용하는 것이 필수적
   지금의 경우 범위가 나와있지 않기 때문에 int로 선언해서 해도 상관없음

😀 공백으로 A와 B구분하기 위해 long 선언은 잘못된 생각
   공백(Space), 탭(Tab), 줄바꿈(Enter)를 구분하는 것은 모두 Scanner의 기능
*/
