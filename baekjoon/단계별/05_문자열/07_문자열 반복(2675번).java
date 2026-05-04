/*
백준 2675번 - 문자열 반복
날짜: 2026/2/22 (일) | 소요시간: 30분

[접근 방식]
테스트 케이스 갯수 t
s 선언, r번 반복, 새문자열 p
첫 문자를 r번 반복, 두번째 문자 r번 반복

# ai와 푸는 방법 거의 일치
*/

/* 입력: 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
        각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
   출력: 각 테스트 케이스에 대해 P를 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 변수 선언
        int T = Integer.parseInt(br.readLine());

        // T 번 반복
        for (int i = 0; i < T; i++) {
            // 공백을 기준으로 문자열 받기
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/*
[복기]
✅ QR Code "alphanumeric" 문자?
   QR Code가 저장할 수 있도록 정해둔 문자 집합 중 하나
*/
