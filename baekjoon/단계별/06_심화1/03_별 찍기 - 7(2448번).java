/*
백준 2448번 - 별 찍기 - 7
날짜: 2026/3/3 (화) | 소요시간: 80분
(3/2 월요일 날 잡생각이 많아져서 건너뜀,,)

[접근 방식]
N 변수 선언
for으로 2 * N-1 반복

패턴
N번째 까지는 별이 2개씩 늘어남, N번째 이후 별이 2개씩 줄어듦
공백은 하나씩 줄어듦

왜 이 문제가 오래 걸렸는지
마름모를 반틈 잘라서 반복문을 나눌 생각을 하지 못했음
오른쪽 공백을 안 넣는다 생각하지 못하고, 어떻게 별을 중간에 찍을 수 있는지에 대해 생각함.
*/

/* 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
   출력: 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int e = 0; e < N - i; e++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int e = 0; e < N - i; e++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
