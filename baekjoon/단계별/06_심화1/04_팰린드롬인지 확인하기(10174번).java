/*
백준 10174번 - 팰린드롬인지 확인하기
날짜: 2026/3/4 (수) | 소요시간: 20분

[접근 방식]
단어 받기
단어가 앞으로 읽을때 거꾸로 읽을때 똑같은지 어떻게 알지?
문자열을 뒤집는 메소드가 존재 할 것임
삼항연산자로 1 또는 0 출력

# ai와 풀이 방식 일치
근데 투 포인터 방식이 더 정석이라고 함
StringBuilder(s).reverse()의 경우 새로운 문자열을 생성해서 메모리에 비효율적
*/

/* 팰린드롬인지 아닌지 확인하는 프로그램
   입력: 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고,
        100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
   출력: 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        // 문자열 뒤집기
        String reversed = new StringBuilder(N).reverse().toString();
        // 출력
        System.out.println(N.equals(reversed) ? 1 : 0);
    }
}

/*
[복기]
✅ 메모리 사용을 줄이면 어떤 이점이 있는가
   1) 프로그램이 더 안정적으로 동작한다
   2) 속도가 빨라진다
   3) 대규모 입력을 처리할 수 있다

✅ 문자열을 뒤집는 방법
   StringBuilder.reverse()
   StringBuffer.reverse()

✅ StringBuilder는 가변 문자열
*/
