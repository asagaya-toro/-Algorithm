/*
백준 10952번 - A+B - 5
날짜: 2026/1/24 (토) | 소요시간: 30분

[접근 방식]
처음에 반복을 해야 하니까 for를 해야 하나 생각함
아무리 생각해도, 몇번 반복해야 하는지 모르기 때문에 for 사용은 불가능하다 생각.
다른 반복문을 찾아보고 while 로 풀어야 한다 생각
0 0 이 되면 멈춰야 하기 때문에 if문으로 작성
*/

/* 입력: 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
   입력의 마지막에는 0 두 개가 들어온다.
   출력: 각 테스트 케이스마다 A+B를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 결과 변수 선언
        String result = "";

        // 총 몇 번 돌아가는 지만, 언제 멈춰야 되는지 알기 때문에 while
        while (true) {
            String arr[] = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            // A와 B가 0 이면 멈춤
            if (A == 0 && B == 0) {
                break;
            }

            result = String.valueOf(A + B);
            // 출력
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
    }
}
