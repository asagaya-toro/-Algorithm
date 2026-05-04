/*
백준 11022번 - A+B - 8
날짜: 2026/1/18 (일) | 소요시간: 15분

[접근 방식]
참고하지 않고, 어제의 기억대로 적어본다.
BufferedWriter은 문자열이 하나라도 존재 시, 자동으로 String으로 바꾸기 때문에
출력해야 할 변수들을 형변환하지 않고 출력한다.
*/

/* 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
   출력: 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
   x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수 변수 선언
        int T = Integer.parseInt(br.readLine());

        // 공백을 기준으로 한 줄씩 읽어 들여 A, B 변수 선언
        for (int i = 1; i <= T; i++) {
            String arry[] = br.readLine().split(" ");
            int A = Integer.parseInt(arry[0]);
            int B = Integer.parseInt(arry[1]);

            // 버퍼에 저장
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
            bw.newLine();
        }
        // 출력
        bw.flush();
    }
}
