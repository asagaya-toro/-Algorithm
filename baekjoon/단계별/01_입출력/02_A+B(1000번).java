/*
백준 1000번 - A+B
날짜: 2025/12/12 (금) | 소요시간: 50분

[접근 방식]
문제를 제대로 보지 않고, 처음에 A, B를 선언해서 숫자를 직접 넣으면 되는 줄 알았음
*/

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
    }
}

/*
[복기]
1차 시도 - A, B에 직접 숫자 대입 → 입력을 받아야 하는 걸 인지 못함
2차 시도 - 랜덤 함수 사용 → "입력받는다"는 걸 또 인지 못함
3차 시도 - Scanner 사용 → 통과!

입력 = Scanner 라는 걸 기억하자
** 문제를 잘 읽어보자..
*/
