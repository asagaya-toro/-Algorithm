/*
백준 10811번 - 바구니 뒤집기
날짜: 2026/2/13 (금) | 소요시간: 60분

[접근 방식]
최종적으로 구해야 하는 것
무엇을 비교
어떻게 비교해서 넣지?
맨 마지막 값 = 첫번째 값
맨 마지막 전의 값 = 두번째 값 ...
몇 번 반복해서 넣어야 하는거지?
*/

/* 입력: 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
   둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
   출력: 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력
*/
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백을 기준으로 문자열 나누기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N(바구니 갯수)과 M(반복 횟수)선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 바구니 배열 생성
        int arr[] = new int[N];

        // 바구니 배열 초기화값 담기
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // M 만큼 반복
        for (int k = 0; k < M; k++) {
            // i,j번째 바구니 선언
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            /* 맨 마지막 값 = 첫번째 값
               맨 마지막 전의 값 = 두번째 값 ...
               i가 j보다 커지면 멈춘다. */
            while (i < j) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[j - 1];
                arr[j - 1] = temp;
                i++;
                j--;
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
몇번 반복해야하지에 대해 가질 생각..
더 이상 바꿀 게 없을 때는 언제인가?
양쪽이 만났을 때인가?
이렇게 생각했다면 i<j 일때라고 떠오른다.
계속 for문으로 몇번 반복해야 하지 라고 반복 횟수만 생각해서 답이 안 나왔던 것..

언제 멈추는가를 생각하자.
*/
