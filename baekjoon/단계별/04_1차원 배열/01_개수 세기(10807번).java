/*
백준 10807번 - 개수 세기
날짜: 2026/1/27 (화~수) | 소요시간: 70분

[접근 방식]
첫번째 반복문에서 null 에러가 발생하는데 아직 그 이유를 못 찾음..
*/

/* 입력: 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        둘째 줄에는 정수가 공백으로 구분되어져있다.
        셋째 줄에는 찾으려고 하는 정수 v가 주어진다
   출력: N개의 정수 중에 v가 몇 개인지 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫번째 줄: 정수 선언
        int N = Integer.parseInt(br.readLine());
        // 두번째 줄: 공백을 기준으로 숫자를 나눠서 배열에 넣음
        String arry[] = br.readLine().split(" ");
        // 세번째 줄: 정수 선언
        String V = br.readLine();
        int result = 0;

        // 첫번째 정수 만큼 반복됨 (반복되는 수를 아니까 for문)
        for (int i = 0; i < N; i++) {
            // 세번째 숫자에 해당하는 숫자를 배열에서 찾아야 함.
            if (arry[i].equals(V)) {
                result++;
            }
        }
        System.out.print(result);
    }
}
