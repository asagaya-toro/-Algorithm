/*
백준 11718번 - 그대로 출력하기
날짜: 2026/2/26 (목) | 소요시간: 15분

[접근 방식]
입력 문자열 받기
반복문으로 문자열 출력
반복문이 몇번 이루어지는지 모르니 while 사용
반복문 안이니까 sb로 출력

# ai 코딩
String line;
while ((line = br.readLine()) != null) {
이런식으로도 가능함,,
*/

/* 입력: 입력은 최대 100줄로 이루어져 있고,
        알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
   출력: 입력받은 그대로 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}

/*
[복기]
✅ BufferedReader
   버퍼(임시 저장 공간) 를 사용해서 입력을 한 글자씩 읽는 게 아니라 덩어리로 읽어옴
   줄 단위 입력은 BufferedReader가 안정적
*/
