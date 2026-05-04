/*
백준 10813번 - 공 바꾸기
날짜: 2026/2/6 (목~금) | 소요시간: 60분

[접근 방식]
M 만큼 반복하며 서로 공 위치 바꾸는 부분에 왜 제대로 출력이 안되는건지 파악 못함
배열에서 두 값을 바꾸기 위해 임시 변수를 생각하지 못한게 원인
챗 지피티는 내가 값의 생명주기를 보는 단계가 부족하다고 한다.
*/

/* 입력: 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
   둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
   i번 바구니와 j번 바구니에 들어있는 공을 교환
   출력: 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한줄의 문자열 공백을 기준으로 나누기
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 바구니 갯수, 반복문 수, 배열 변수 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        // N 만큼 반복하며 초기화된 배열에 숫자 담기
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }
        // M 만큼 반복하며 서로 공 위치 바꾸기
        for (int e = 0; e < M; e++) {
            // 두번째 줄 부터 공백을 기준으로 나누기
            st = new StringTokenizer(br.readLine());
            // 바구니 번호 변수 선언
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 값을 어딘가에 저장 해 놔야함.
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }
        // 출력
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}
