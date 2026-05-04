/*
백준 11005번 - 진법 변환 2
날짜: 2026/4/28 (화) | 소요시간: 20분

[접근 방식]
B진법을 10진법으로 변환 하는 내장함수가 있듯, 10진법을 B진법으로 변환하는 내장함수가 존재 할거라 생각.
Integer.parseInt : String -> int
Integer.toString : int -> String
수학적 풀이 : 10진법 % B진법 ... 나머지

toString은 소문자로 반환
String문자열 처리 (자르기, 합치기, 찾기 등)
Integer정수 처리 (변환, 계산 등)
*/

/* 입력: 첫째 줄에 N과 B가 주어진다.
   출력: 첫째 줄에 10진법 수 N을 B진법으로 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int num = Integer.parseInt(arr[0]);

        String result = Integer.toString(num, Integer.parseInt(arr[1])).toUpperCase();
        System.out.println(result);
    }
}

/*
[ai 일치률]
ai와 풀이 방식 일치

[복기]
-
*/
