/*
백준 1004번 - A/B
날짜: 2025/12/15 (월) | 소요시간: 3분

[접근 방식]
어제랑 유형이 같아서 고민한 것은 없다.
출력이 소수이기 때문에 double 생각
*/

// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // A, B 변수 선언
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        // 출력
        System.out.print(A / B);
    }
}
