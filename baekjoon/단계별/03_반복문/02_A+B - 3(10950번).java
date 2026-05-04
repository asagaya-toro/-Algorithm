/*
백준 10950번 - A+B - 3
날짜: 2026/1/11 (일) | 소요시간: 10분

[접근 방식]
첫번째 주어지는 숫자를 구하고, (몇번 반복할 것인가)
다음 번째 부터는 각 숫자를 더한다. (반복문 안에서 구해야 하는 것)
*/

// 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력: 각 테스트 케이스마다 A+B를 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 첫번째 숫자만큼 반복해서 출력 해야 함
        int arr = sc.nextInt();

        // 각 케이스의 덧셈을 구한다.
        for (int i = 1; i <= arr; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 출력
            System.out.println(a + b);
        }
    }
}
