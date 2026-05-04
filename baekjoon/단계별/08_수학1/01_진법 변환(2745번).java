/*
백준 2745번 - 진법 변환
날짜: 2026/4/27 (월) | 소요시간: 20분

[접근 방식]
36진법도 있나?
원래 진법 계산법 : 각 자리 숫자 × 진법^자리번호
자바에서는 Integer.parseInt(N, B)의 내장함수로 진법 계산 가능
코테 채점 시간이 길었던 이유 : 서버 대기열 문제로
Python에도 Integer.parseInt(N, B)와 같은게 존재
*/

/* 입력: 첫째 줄에 N과 B가 주어진다.
   출력: 첫째 줄에 B진법 수 N을 10진법으로 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");
        // B진법 -> 10진법
        int result = Integer.parseInt(arr[0], Integer.parseInt(arr[1]));
        // 결과
        System.out.println(result);
    }
}

/*
[ai 일치률]
ai와 풀이 방식 일치

[복기]
-

[파이썬 변환]
   진법    | 표현                              | 사용하는 곳
   2진법   | 0, 1, 10, 11, 100, 101, 110, 111 | 컴퓨터 내부
   8진법   | 0~7만 사용                        | 파일 권한 (Linux)
   10진법  | 0, 1, 2, 3, 4, 5, 6, 7, 8, 9    | 일상생활
   16진법  | 0~9, A~F 총 16개 기호             | 색상코드 (#FF0000), 메모리 주소
   36진법  | 0~9 + A~Z 총 36개 기호            | URL 단축 서비스, 시리얼 번호
   62진법  | 0~9 + a~z + A~Z 총 62개 기호     | YouTube 영상 ID
*/
