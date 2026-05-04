/*
백준 2439번 - 별 찍기 - 2
날짜: 2026/1/21 (화~수) | 소요시간: 50분

[접근 방식]
Buffered에 익숙해지기 위해 사용
공백을 N-1개, 별을 i번 출력한다.
근데 한 문장에 출력한다는 사고를 못해서 계속 따로 따로 for문을 작성함.

"이 문제에서 한 줄은 어떤 모양인가?"
1) i번째 줄 = " "(N - i) + "*"i
2) 몇 번 반복되는가
이런식으로 차례차례 생각하기
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

        // N수 만큼 반복
        for (int i = 1; i <= N; i++) {
            // 공백이 N-1개
            for (int e = N - 1; e >= i; e--) {
                bw.write(" ");
            }
            // 별을 i번 출력
            for (int s = 1; s <= i; s++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
