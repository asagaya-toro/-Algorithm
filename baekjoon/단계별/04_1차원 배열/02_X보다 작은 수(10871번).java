/*
백준 10871번 - X보다 작은 수
날짜: 2026/1/29 (목) | 소요시간: 20분

[접근 방식]
어제 Buffered로 문제를 풀었는데, Scanner랑 채점 시간 많이 차이 안나길래,, Scanner로 풀어봄..
실무에서도 가공된 형태로 데이터가 넘어오기 때문에 Buffered를 거의 안 쓴다고 하지만,,
문자열 파싱 비용 존재,, 반복 I/O는 느리다,, 이런 입력 처리 원리를 배우기 위함으로 사용,,

배열 문제인데 배열을 안 쓰고 문제를 풀어서 이게 맞나,, 했다.
찾아보니 이 문제에서는 오히려 배열을 쓰는게 불필요하다고 한다.
*/

/* 입력: 첫째 줄에 N과 X가 주어진다.
   둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
   출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        // N 갯수 만큼 반복문
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            // A 보다 큰 X만 출력
            if (X > A) {
                System.out.print(A);
                System.out.print(" ");
            }
        }
    }
}

/*
[복기]
😀 배열이 필요한 경우
   1) 나중에 다시 써야 할 때
   2) 여러 번 비교 / 계산해야 할 때
   3) 전체를 보고 판단해야 할 때
*/
