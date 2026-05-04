/*
백준 2563번 - 색종이
날짜: 2026/4/24 (금)~(일) | 소요시간: 60분 (문제 이해에만 20분 걸림,,)

[접근 방식]
문제를 읽는데도 난관이 걸림,,
첫번째를 첫째줄 이라 생각하고, 예제 입력은 총 4줄인데 ,, 생각함

처음에는 색종이의 전체 넓이 - 겹치는 부분을 하려고 했는데,,
도저히 생각해도 겹치는 부분을 배열로 어떻게 구별 하는건지 잘 모르겠었음.
ai에게 물어가며 각각의 색종이의 넓이를 배열 1로 선언
전체의 도화지 넓이에서 1로 선언된 배열만 세기 로 문제 품.
*/

/* 입력: 첫째 줄에 색종이의 수
        첫 번째 자연수 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
        두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
   출력: 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int colorPaper = Integer.parseInt(br.readLine());

        // 도화지 배열 선언
        int paper[][] = new int[100][100];

        for (int i = 0; i < colorPaper; i++) {
            String arr[] = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            for (int j = x; j < x + 10; j++) {
                for (int z = y; z < y + 10; z++) {
                    paper[j][z] = 1;
                }
            }
        }
        // 배열 길이 세기
        int count = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*
[ai 일치률]
ai는 1로 선언된 배열을 따로 세지 않고,
배열 1을 선언 할때, 같이 숫자를 카운트 해서 답을 구한다 함.
좀 더 효율적임..

[복기]
-

[파이썬 변환]
| | Java | Python |
|--|------|--------|
| 실행 방식 | 클래스 → 메인 → 코드 (객체지향 언어: 객체[설계]로 관리) | 위에서 아래로 바로 실행 (스크립트 언어) |
| 코드량 | 많음 | 적음 |
| 쓰임새 | 백엔드 서버 개발, 공공기관, 대규모 프로젝트 | 데이터 분석, AI/머신러닝, 자동화 스크립트 |
*/
