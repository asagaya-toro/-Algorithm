/*
백준 1152번 - 단어의 개수
날짜: 2026/2/23 (월) | 소요시간: 30분

[접근 방식]
문자열 받기
앞 뒤 공백 없애기
공백을 기준으로 자르기
배열의 length구하기

# ai와 푸는 방법 거의 일치
*/

/* 입력: 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        문자열은 공백으로 시작하거나 끝날 수 있다.
   출력: 첫째 줄에 단어의 개수를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 앞 뒤 공백 없애기
        String s = br.readLine().trim();
        if (s.length() == 0) {
            // 출력
            System.out.println("0");
        } else {
            // 공백을 기준으로 단어 자르기
            String word[] = s.split(" ");
            // 출력
            System.out.println(word.length);
        }
    }
}

/*
[복기]
✅ 공백 제거 메소드
   trim()              - 공백 앞 뒤 제거
   replace(" ", "")    - 문자열 전체 공백을 모두 제거
   replaceAll("\\s", "") - 모든 종류의 공백 제거 (탭 포함)
*/
