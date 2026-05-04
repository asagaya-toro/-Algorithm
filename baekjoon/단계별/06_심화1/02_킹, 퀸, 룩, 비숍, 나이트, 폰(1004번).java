/*
백준 1004번 - 킹, 퀸, 룩, 비숍, 나이트, 폰
날짜: 2026/2/28 (토) | 소요시간: 20분

[접근 방식]
찾은 흰색피스 배열로 split으로 공백 나눠서 선언
arr 배열 수 만큼 for 문을 돌리며, chess배열에서 주어진 수 빼기
반복문이 별로 없으니까 sys.out으로 출력
*/

/* 검은색 피스는 전부 존재, 흰색 피스 부족
   체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
   입력: 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
   출력: 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int chess[] = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(chess[i] - Integer.parseInt(arr[i]) + " ");
        }
    }
}

/*
[복기]
✅ Integer.parseInt()는 문자열 하나만 정수로 바꿀 수 있다.

✅ int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
   split() 결과가 String[]이므로, mapToInt(Integer::parseInt)로 int변환
   .toArray() 로 int[] 배열 만들어짐
*/
