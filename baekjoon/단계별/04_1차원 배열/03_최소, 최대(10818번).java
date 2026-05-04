/*
백준 10818번 - 최소, 최대
날짜: 2026/1/31 (금~토) | 소요시간: 80분

[접근 방식]
N만큼 반복문 돌리면서,
if문으로 arr[i] , arr[i+1] 비교해서 최소값, 최대값 구하면되지 않을까. .
arr[i+1]을 하자니, null에러 발생
필요없는 코드들도 많은데,, 이 생각들이 어떻게 바뀌어 가는지 기록하기 위해 날것 그대로 기록..
*/

/* 입력: 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
   둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다
   출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        // 첫째줄 N 정수 선언
        int N = Integer.parseInt(line);

        // 두번째 줄 정수 배열 선언
        String line2 = br.readLine();
        // 공백 기준으로 size 구하기
        StringTokenizer st = new StringTokenizer(line2);
        int size = st.countTokens();
        // size만큼 arr배열 선언
        int[] arr = new int[size];
        int first = Integer.parseInt(st.nextToken());
        // 최소값, 최대값 변수 선언
        int min = first;
        int max = first;

        // N 정수 만큼 반복문
        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num <= min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.print(min + " " + max);
    }
}

/*
[복기]
😀 StringTokenizer 기능
   StringTokenizer vs split 언제 뭐 쓰는지
   StringTokenizer는 다음 줄을 불러오지 못함
   st.countTokens(); 어떻게 배열로 선언
*/
