/*
백준 10810번 - 공 넣기
날짜: 2026/2/4 (월~수) | 소요시간: 80분

[접근 방식]
문제 이해하는데 시간 걸림
마지막에 넣어져 있는 공의 번호를 구함
*/

/* 입력: 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
   출력: 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
        공이 들어있지 않은 바구니는 0을 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N, M 변수 선언 (공백을 기준으로 입력 숫자 나누기)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        // M 만큼 반복
        for (int e = 0; e < M; e++) {
            // 1번 바구니부터 N번 바구니에 들어있는 공의 번호 선언
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());

            // i번 바구니부터 j 번 바구니에 k 넣기
            for (int h = i; h <= j; h++) {
                arr[h - 1] = k;
            }
        }
        // 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
[복기]
😀 StringTokenizer 의 기능
   공백(기본 구분자)을 기준으로 문자열을 나눠서 순서대로 읽게 해주는 도구

😀 StringTokenizer vs split 언제 뭐 쓰는지
   split        : 문자열을 한 번에 전부 잘라서 배열로 만듦 (입력이 적거나, 정규식으로 복잡하게 자를 때)
   StringTokenizer : 필요한 순간에 하나씩 꺼내 씀 (입력이 많을때)

😀 반복문안에서 또 new StringTokenizer(br.readLine()); 써야 하는 이유
   한 줄 = 하나의 StringTokenizer

😀 StringTokenizer의 기본 구분자 = 공백
   new StringTokenizer(br.readLine(), " ") 과
   new StringTokenizer(line) 은 동일함

😀 arr[h-1] = k; (-1을 해야 하는 이유)
   바구니 번호는 1부터 시작 하지만, 배열 인덱스는 0부터 시작하므로

😀 StringBuilder 과 print의 출력 방식 차이
   print 방식
   [계산] → [출력]
   [계산] → [출력]
   [계산] → [출력]
   출력 호출 횟수 ↑, OS 호출 횟수 ↑, 프로그램 전체 시간 ↑

   StringBuilder 방식
   [계산][계산][계산][계산] → [출력]
   출력은 마지막에 한 번만 실행함.
*/
