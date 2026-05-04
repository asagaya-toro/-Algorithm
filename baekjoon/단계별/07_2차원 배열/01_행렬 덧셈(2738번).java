/*
백준 2738번 - 행렬 덧셈
날짜: 2026/3/18(수)~4/21(화) 재시작
(그 사이 한국 간다고,, 꽤 많은 일들이 발생해버린,, 암튼,, 다시 코테 시작합니다.)
*/

/* 입력: 첫째 줄에 행렬의 크기 N 과 M이 주어진다.
        둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
        이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
   출력: 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NandM[] = br.readLine().split(" ");
        int N = Integer.parseInt(NandM[0]);
        int M = Integer.parseInt(NandM[1]);

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];

        // 행렬 A
        for (int i = 0; i < N; i++) {
            String a[] = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arrA[i][j] = Integer.parseInt(a[j]);
            }
        }
        // 행렬 B
        for (int i = 0; i < N; i++) {
            String a[] = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arrB[i][j] = Integer.parseInt(a[j]);
                arrB[i][j] += arrA[i][j];
                System.out.println(arrB[i][j]);
            }
        }
    }
}

/*
[복기]
예전에 3월달에 풀때는 문제가 이해가 안 갔는데,
N과 M이라는 말 대신 직접 숫자를 넣어 풀어봤다.
→ 3개의 줄에 A의 원소 3개가 주어진다.
→ 3개의 줄에 B의 원소 3개가 주어진다.
이렇게 하니까 문제가 더 직관적으로 보여서 이해가 갔다.

그리고 다시 문제를 읽어보니 A와 B 행렬 이외는 없기 때문에
위와 같이 행렬 두개를 나눠서 반복문을 돌리면 된다는 거..
예전에는 저거를 생각 못하고 행렬의 숫자 자체도 코테에서 정하는건 줄 알고 어떻게 풀라는 거지 ,, 이랬다.
결국 A + B 행렬을 구하라는 것..
*/
