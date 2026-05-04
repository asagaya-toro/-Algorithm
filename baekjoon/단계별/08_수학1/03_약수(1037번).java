/*
백준 1037번 - 약수
날짜: 2026/4/30 (목)~금 | 소요시간: 45분
*/

/* 입력: 첫째 줄에 N의 진짜 약수의 개수가 주어진다.
        둘째 줄에는 N의 진짜 약수가 주어진다.
   출력: 첫째 줄에 N을 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 약수의 개수
        int divisorCount = Integer.parseInt(br.readLine());
        int result = 0;
        int[] divisors = new int[50];
        String arr[] = br.readLine().split(" ");

        // 약수의 개수 만큼 반복
        for (int i = 0; i < divisorCount; i++) {
            divisors[i] = Integer.parseInt(arr[i]);
        }

        // 배열정렬
        Arrays.sort(divisors, 0, divisorCount);
        if (divisorCount >= 2) {
            result = divisors[0] * divisors[divisorCount - 1];
        } else {
            result = divisors[0] * divisors[0];
        }
        System.out.println(result);
    }
}

/*
[ai 일치률]
ai랑 비교하니까,. 엄청 난잡하게 품

[복기]
-
*/
