/*
백준 2743번 - 단어 길이 재기
날짜: 2026/2/16 (월) | 소요시간: 5분

[접근 방식]
문자 입력 받기
length로 길이 구하기

# AI와 문제 풀이 일치
*/

/* 입력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
   출력: 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄 문자 받기
        String word = br.readLine();
        // 문자열 길이 출력
        System.out.println(word.length());
    }
}

/*
[복기]
✅ length가 아닌 length()인 이유
   length   : 이미 저장된 값 (배열), int는 길이라는 개념 자체가 없음
   length() : 기능을 실행해서 얻는 값, String은 단순 값이 아니라 객체

✅ 문자열 길이 구하는 기본 메소드는 length()뿐
   다른 방법들은 우회해야 해서 비효율적
*/
