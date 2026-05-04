/*
백준 10951번 - A+B - 4
날짜: 2026/1/26 (일~월) | 소요시간: 60분

[접근 방식]
몇번 반복 해야 하는지 모르기 때문에 while 문 사용
반복문을 멈춰야 하는데 어느 시점에 멈춰야 하는가..
String arr[] = line.split(" "); 을 하기 전에 null이 아닌지 판단 해야함.

여태껏 arr[1]로 입력을 받았는데 왜 이번에는 arr[2]로 받는 것인지에 대해
arr[1] = line.split(" ");
arr[2] = line.split("");
공백도 하나의 문자로 그대로 나눠서 arr[2]로 됨.
*/

// 입력: 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
// 출력: 각 테스트 케이스마다 A+B를 출력한다.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // while로 반복
        while (true) {
            String line = br.readLine();
            // null이 아닌 경우 반복
            if (line != null) {
                String arr[] = line.split("");
                // 각 변수 선언
                int A = Integer.parseInt(arr[0]);
                int B = Integer.parseInt(arr[2]);
                String result = String.valueOf(A + B);
                bw.write(result);
            } else {
                break;
            }
            bw.newLine();
        }
        bw.flush();
    }
}
