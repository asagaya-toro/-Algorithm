/*
백준 11720번 - 숫자의 합
날짜: 2026/2/19 (목) | 소요시간: 20분

[접근 방식]
첫째 줄 문자 숫자로 받기
둘째줄 문자 문자로 받기
둘째줄 문자 split으로 자르기
첫째 줄 숫자 만큼 문자 더하기
맨 마지막에 출력은 하나니까 sys.out으로

# AI와 문제 거의 일치
*/

/* 입력: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
   둘째 줄에 숫자 N개가 공백없이 주어진다.
   출력: 입력으로 주어진 숫자 N개의 합을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째줄, 둘째줄 변수 선언
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");

        // arr[] 배열을 숫자로 변경, N수 만큼 반복문 돌며 다 더하기
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}

/*
[복기]
✅ 문자열 자르기
   1) split()
      정규표현식(Regex) 기준으로 문자열을 잘라 String 배열로 반환
      s.split("") 한 글자씩 자르기 용

   2) substring()
      문자열의 특정 구간을 잘라서 새 문자열 생성
      s.substring(1, 4)

   3) charAt()
      문자 하나씩 접근할 때 사용
      charAt(0);

   4) StringTokenizer
      구분자 기준으로 문자열을 토큰 단위로 읽음
      StringTokenizer st = new StringTokenizer("a,b,c", ",");

✅ charAt() 숫자로 변환
   (int) char          → 문자의 ASCII(유니코드) 값을 출력
   charAt(i) - '0'     → 문자 '0'의 아스키 코드값(48)을 기준으로 빼면, 문자 숫자가 실제 정수값으로 변환

   공백/쉼표 등 구분자로 자르기  → split()
   여러 구분자 동시에             → split("[,: ]")
   한 글자씩 처리                → charAt() 또는 split("")
   문자열 일부만 잘라내기         → substring()
   빠르게 토큰 처리              → StringTokenizer
*/
