/*
백준 2908번 - 상수
날짜: 2026/2/24 (화) | 소요시간: 20분

[접근 방식]
공백을 기준으로 문자열을 숫자로 받는다.
숫자를 거꾸로 받는다. (메소드 사용)
비교 메소드를 사용하여 출력한다.

# ai와 푸는 방법 거의 일치
비교 메소드가 존재 할 것이라 생각했는데, Math.max가 있다는 것을 잊었다.
*/

/* 입력: 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
        두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
   출력: 첫째 줄에 상수의 대답을 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 공백을 기준으로 문자 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // 더 큰 것을 출력
        System.out.println(A > B ? A : B);
    }
}

/*
[복기]
✅ split, token 차이
   split()  - 문자열(String)의 메소드
              한 줄을 통째로 입력받았을 때
              특정 문자 기준으로 자를 때
              정규표현식 사용 가능

   token    - 문자열을 잘라주는 별도의 도구 클래스
              코테 처럼 입력이 빠르게 많이 들어올 때
              속도가 중요할 때

   split의 정규식 처리는 내부적으로 연산이 많아, 입력이 아주 많으면 느릴 때가 존재하지만,
   대량 입력에서 그 차이가 발생하기 때문에 평소에 사용하는 거에는 큰 차이가 없음

✅ reverse() : 문자열 거꾸로 뒤집는 메소드
   StringBuilder의 메소드 (가변)

   기본 구조
   String reversed = new StringBuilder(문자열).reverse().toString();
   1단계: new StringBuilder("abc") → "abc"를 담은 가변 객체 생성
   2단계: .reverse()               → 내부 값이 "cba"로 바뀜
   3단계: .toString()              → String 타입으로 변환
*/
