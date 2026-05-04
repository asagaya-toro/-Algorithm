/*
백준 1008번 - 사칙연산
날짜: 2025/12/17 (수) | 소요시간: 4분

[접근 방식]
double로 할지 int로 할지 고민 했다가 출력 형식 보고 int
print로 하려다가 한 줄에 하나씩 출력이 안되서 println로 적음
*/

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
// 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // A, B 변수 선언
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 출력
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
