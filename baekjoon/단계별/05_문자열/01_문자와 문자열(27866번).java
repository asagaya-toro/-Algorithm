/*
백준 27866번 - 문자와 문자열
날짜: 2026/2/15 (일) | 소요시간: 10분

[접근 방식]
S와 i 를 선언 받는다.
반복문을 돌려서 해당 글자를 찾는다.
혹은 substring, charAt, Arrays.copyOfRange 으로 자른다.
substring, charAt, Arrays.copyOfRange은 입출력때도 한번 나왔던 클래스 함수

# AI와 문제 풀이 일치
*/

/* 출력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
   둘째 줄에 정수 i가 주어진다.
   입력: S의 i번째 글자를 출력한다.
*/
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        // charAt으로 문자열 자르기
        char result = S.charAt(i - 1);
        // 출력
        System.out.println(result);
    }
}

/*
[복기]
✅ 문자열 자르는 java 메소드
   substring   | 문자열 | 여러 글자 | String
   charAt      | 문자열 | 한 글자   | char
   copyOfRange | 배열   | 여러 요소 | 배열

✅ substring 사용법
   s.substring(2, 4);

✅ charAt 사용법
   s.charAt(2);

✅ copyOfRange 사용법
   int[] result = Arrays.copyOfRange(arr, 1, 4);
*/
