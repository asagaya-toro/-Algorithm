/*
백준 10798번 - 세로읽기
날짜: 2026/4/23 (목) | 소요시간: 50분

[접근 방식]
다음 숫자가 공백일 것도 생각해야함
5번 반복
*/

/* 주어진 문자열: 'A'부터 'Z', 영어 소문자 'a'부터 'z', 숫자 '0'부터 '9'
   입력: 다섯줄의 입력이 이루어지고, 각 줄은 1~15개의 글자
   출력: 배열을 세로로 공백 없이 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result[][] = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String arr[] = br.readLine().split("");
            int arrLength = arr.length;
            for (int j = 0; j < arrLength; j++) {
                result[i][j] = arr[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (result[j][i] == null) {
                    continue;
                }
                System.out.print(result[j][i]);
            }
        }
    }
}

/*
[ai 일치률]
ai와 풀이 방식 일치

[복기]
-
*/
