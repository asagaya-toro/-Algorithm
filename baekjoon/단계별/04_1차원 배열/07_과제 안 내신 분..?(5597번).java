/*
백준 5597번 - 과제 안 내신 분..?
날짜: 2026/2/9 (토~월) | 소요시간: 70분
(2/8 일요일 코테 안 품)

[접근 방식]
배열을 하나 더 만들 생각을 못해서 시간이 오래 걸림.
처음에는 28번 반복하며 배열 안에 숫자를 넣을 때 오름차순으로 정렬하면서 넣으려고 했음.
배열의 숫자를 받으면서 정렬하려고 하니 잘 안됨,,
챗 지피티한테 배열을 하나 더 만들라는 힌트 얻어서 문제 해결..
*/

/* 입력: 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
   출력: 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
*/
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[28];
        boolean check[] = new boolean[31];

        // 총 28번 반복하며 배열 안에 숫자 넣기
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            check[num] = true;
        }
        // 1~ 31번 반복하며, false인 값 찾기
        for (int i = 1; i <= 30; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
