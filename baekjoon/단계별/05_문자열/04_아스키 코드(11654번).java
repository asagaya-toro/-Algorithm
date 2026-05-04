/*
백준 11654번 - 아스키 코드
날짜: 2026/2/18 (수) | 소요시간: 10분

[접근 방식]
첫째줄의 문자열을 선언
String을 char 로 변환
출력 (따로 반복문 없이 문자 하나만 출력 하는거라 Sys.out사용)

# AI와 문제 거의 일치
*/

/* 입력: 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
   출력: 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄 변수 선언
        String word = br.readLine();
        // char로 변환
        char a = word.charAt(0);
        System.out.println((int) a);
    }
}

/*
[복기]
✅ br.readLine()에서 바로 char로 받기
   char ch = br.readLine().charAt(0);

✅ String에서 char로 변환 할때 어떻게? -> charAt()을 사용
   String.valueOf와 같은 건 없는지 -> 없음

✅ (int)a 로 출력해야 하는 이유
   char는 문자처럼 보이지만 내부적으로는 숫자(유니코드 값) 를 저장하는 정수
   char   → 문자 출력
   (int) char → 숫자 출력
*/
