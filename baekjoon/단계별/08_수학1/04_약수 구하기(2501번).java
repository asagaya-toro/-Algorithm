/*
백준 2501번 - 약수 구하기
날짜: 2026/5/1 (토) | 소요시간: 30분

[접근 방식]
공백을 기준으로 숫자를 나눔
첫째수의 약수를 전부 구해서 배열로 담음
두번째 숫자의 배열 자리의 숫자를 구함
숫자가 없는 경우 0 출력
*/

/* 입력: 첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다.
   출력: 첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");

        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
                if (count == y) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}

/*
[ai 일치률]
ai랑 비교하니까,. 엄청 난잡하게 품

[복기]
-
*/
