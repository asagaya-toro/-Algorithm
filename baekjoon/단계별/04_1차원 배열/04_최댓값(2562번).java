/*
백준 2562번 - 최댓값
날짜: 2026/2/1 (일) | 소요시간: 30분

[접근 방식]
무조건 9개의 자연수가 나온다고 하니 9번 for 반복을 써야겠다.
그 중 최댓값을 구하고, 최대값을 설정 하는 시점에 몇번째 수 인지 if문으로 구해야겠다.
*/

// 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
// 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 최대값 변수 선언
        int max = Integer.parseInt(br.readLine());
        // 배열 수 변수 선언
        int n = 1;

        // 무조건 9번 반복함
        for (int i = 2; i <= 9; i++) {
            int arr = Integer.parseInt(br.readLine());
            // 9번 반복 중 최대값을 구함.
            if (max <= arr) {
                max = arr;
                n = i;
            }
        }
        sb.append(max).append("\n").append(n);

        bw.write(sb.toString());
        bw.flush();
    }
}

/*
[복기]
😀 BufferedReader은 언제 쓰이는 것인지
   메모리에 모아서 한꺼번에 출력 하기 때문에
   I/O 호출 횟수를 줄여서 성능을 지키기 위할때 쓰임
   → 매번 호출하면 느려지고(CPU가 바로 일을 못 하고, OS·장치·네트워크를 기다리는 시간이 폭증),
   쓸데없이 자원을 많이 쓰인다고 함.

😀 BufferedWriter를 쓸 경우 String으로 변환해서 write()하는게 번거로운데 줄일 방법
   StringBuilder(문자열을 계속 붙이기 위해 만든 도구) 사용
*/
