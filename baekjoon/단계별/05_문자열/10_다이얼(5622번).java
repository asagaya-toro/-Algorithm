/*
백준 5622번 - 다이얼
날짜: 2026/2/25 (수) | 소요시간: 60분

[접근 방식]
알파벳을 입력 받기
알파벳이 어느 숫자에 해당하는지 알아야 함
7,9 에 네문자열에 있음.
숫자를 알게 되면 몇 초 걸리는지 계산

어떻게 풀어야 효율적으로 풀게 될까 생각하다 한참 빙빙 돌아서 품..
*/

/* 입력: 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다.
        단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
   출력: 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째줄 입력 받기
        String s = br.readLine();

        // 걸리는 시간을 알아내야 함 (알파벳 -> 걸리는 시간)
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'C') {
                sum += 3;
            } else if ('D' <= s.charAt(i) && s.charAt(i) <= 'F') {
                sum += 4;
            } else if ('G' <= s.charAt(i) && s.charAt(i) <= 'I') {
                sum += 5;
            } else if ('J' <= s.charAt(i) && s.charAt(i) <= 'L') {
                sum += 6;
            } else if ('M' <= s.charAt(i) && s.charAt(i) <= 'O') {
                sum += 7;
            } else if ('P' <= s.charAt(i) && s.charAt(i) <= 'S') {
                sum += 8;
            } else if ('T' <= s.charAt(i) && s.charAt(i) <= 'V') {
                sum += 9;
            } else if ('W' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
