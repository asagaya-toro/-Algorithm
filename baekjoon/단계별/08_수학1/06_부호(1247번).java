/*
백준 1247번 - 부호
날짜: 2026/5/5 (화)

[접근 방식]
3번의 반복문 하며 N 의 수를 선언
N의 수만큼 반복 하며 더하기
if문으로 0 이면 0을, >이면 +를, <이면 -를 출력
*/

/* 입력: 총 3개의 테스트 셋이 주어진다.
        각 테스트 셋의 첫째 줄에는 N이 주어지고,
        둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.
   출력: N개의 정수들의 합 S의 부호를 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            // N 선언
            int N = Integer.parseInt(br.readLine());
            long add = 0L;
            // N 만큼 반복하며 숫자 더하기
            for (int j = 0; j < N; j++) {
                Long number = Long.parseLong(br.readLine());
                add += number;
            }
            if (add > 0) {
                System.out.println("+");
            } else if (add < 0) {
                System.out.println("-");
            } else {
                System.out.println(add);
            }
        }
    }
}
