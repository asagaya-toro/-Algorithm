/*
백준 1546번 - 평균
날짜: 2026/2/14 (토) | 소요시간: 60분

[접근 방식]
시험 갯수만큼 반복문을 돌리고
시험점수를 담을 배열 생성
최댓값을 구해야 함
다시 시험 갯수만큼 반복문을 돌리며 모든 점수를 최대값/M * 100 하고 배열에 담음
그 점수들로 다시 평균을 구함
*/

/* 입력: 첫째 줄에 시험 본 과목의 개수 N이 주어진다.
   둘째 줄에 세준이의 현재 성적이 주어진다
   출력: 첫째 줄에 새로운 평균을 출력한다.
*/
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double arr[] = new double[N];

        // 시험 갯수 만큼 반복문을 돌리고 점수 담기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값을 구할 반복문
        double M = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] > M) {
                M = arr[i];
            }
        }

        // 시험 갯수 만큼 반복문을 돌리며, 거짓 점수 담기
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / M * 100;
        }

        // 그 점수들로 다시 평균을 구하는 배열
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(sum / N);
    }
}

/*
[복기]
풀면서도 반복문이 이렇게 많이 필요한가 했는데
역시 AI한테 물으니 입력을 받으며, 최댓값을 찾을 수 있었다..
1) 입력 받으면서 최댓값 찾기
2) 변환하면서 바로 합 계산
이렇게 두번의 반복문으로 끝나는 거였다..
*/
