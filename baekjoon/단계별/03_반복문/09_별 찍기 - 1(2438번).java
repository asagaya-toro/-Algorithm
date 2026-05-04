/*
백준 2438번 - 별 찍기 - 1
날짜: 2026/1/19 (월) | 소요시간: 10분

[접근 방식]
Buffered에 익숙해지기 위해 사용
반복문 만큼 *을 출력하기 위해 이중 for문을 사용.
*/

// 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 변수 선언
        int N = Integer.parseInt(br.readLine());

        // 반복문 만큼 * 출력
        for (int i = 1; i <= N; i++) {
            for (int s = 1; s <= i; s++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
