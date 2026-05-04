/*
백준 11720번 - 문자열
날짜: 2026/2/17 (화) | 소요시간: 20분

[접근 방식]
테스트 케이스 갯수 선언
갯수 만큼 반복문
반복문 안에서 첫번째와 마지막 글자 출력
맨 마지막 글자를 어떻게 찾지 하며 반복문을 돌려야 하나 생각하다,
맨마지막 문자열을 찾는 메소드가 있을 것 같아 찾아봄

# AI와 출력 방법 다름 (StringBuilder 사용)
*/

/* 입력: 입력의 첫 줄에는 테스트 케이스의 개수
   출력: 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 갯수만큼 반복문 돌리기
        for (int i = 0; i < T; i++) {
            String word = br.readLine();
            // 첫번째와 마지막 문자 찾기
            String first = String.valueOf(word.charAt(0));
            String last = String.valueOf(word.charAt(word.length() - 1));
            // 출력
            System.out.println(first + last);
        }
    }
}

/*
[복기]
✅ char 끼리 + 하면 숫자가 나오는 이유
   자바에서 char는 문자이지만 내부적으로는 정수(유니코드 값)
   System.out.println("" + a + b); 이런식으로 앞에 문자열을 붙이면 문자열로 출력 가능

✅ 지금 문제에서 왜 StringBuilder를 쓰는게 좋은지
   출력 횟수를 줄여서 속도 향상을 위해
   System.out.println()은 호출할 때마다
   콘솔 출력 작업 수행
   내부 버퍼 처리
   OS에 전달
   → 속도 저하
*/
