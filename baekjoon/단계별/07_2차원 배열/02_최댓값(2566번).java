/*
백준 2566번 - 최댓값
날짜: 2026/4/22 (수) | 소요시간: 35분

[접근 방식]
9번 반복문 (2중 반복문)
최대값, 행, 열 변수 선언
최대값 변수 보다 크면 집어 넣기
행, 열 갱신
갱신된 변수 출력
*/

/* 입력: (9×9 격자판) 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다.
   출력: 첫째 줄에 최댓값을 출력하고,
        둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 최대값 변수 선언
        int maxVal = -1;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            String a[] = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                if (maxVal < Integer.parseInt(a[j])) {
                    maxVal = Integer.parseInt(a[j]);
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println(maxVal);
        System.out.printf("%d %d", maxRow, maxCol);
    }
}

/*
[ai 일치률]
ai와 풀이 방식 일치

[파이썬 변환]
파이썬은 public class Main 다 필요없고,,
print(); 로 바로 출력됨..
*/
