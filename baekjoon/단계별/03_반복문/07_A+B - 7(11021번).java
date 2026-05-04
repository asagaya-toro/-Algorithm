/*
백준 11021번 - A+B - 7
날짜: 2026/1/17 (토) | 소요시간: 40분

[접근 방식]
일단 아무것도 참고 하지 않고, 어제의 기억대로 한번 다 적어본다.
테스트 갯수 변수를 선언하고, for 문을 작성하여 계산을 출력한다.
지금 문제는 Scanner 써서도 해결 되지만, 실제로 대량의 데이터를 입력 받는걸 상상하며
Buffered을 사용하는데 익숙해져야 생각.
간단한 문제이지만, Buffered 사용이 익숙하지 않아 기억해 내는데 시간이 걸림.
*/

/* 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
   출력: 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
   테스트 케이스 번호는 1부터 시작한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            // 다음 줄 숫자 읽기 (공백으로 나누기)
            String arr[] = br.readLine().split(" ");
            // A + B의 값 변수 선언
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int addition = A + B;
            String result = String.valueOf(addition);
            // i를 string 형 변환
            String stringI = String.valueOf(i);

            bw.write("Case #");
            bw.write(stringI);
            bw.write(": ");
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
    }
}

/*
[복기]
😀 왜 BufferedReader에 new InputStreamReader(System.in)를 적는가
   BufferedReader(문자)는 System.in(바이트)을 직접 읽을 수 없기 때문
   InputStreamReader를 통해 중간에서 바이트 → 문자로 변환 할 필요

😀 bw.flush();로 출력하려면 형변환이 필수적인데, 이렇게 일일이 형변환 하며 코드를 적어야 하는가,,?
   BufferedWriter는 문자열이 아닌 것도 자동으로 문자열로 바꿔서 출력 가능
   문자열이 하나라도 있으면 자동으로 String 타입으로 변환

😀 BufferedReader와 System.out.println 조합으로 같이 쓸 수 있는데, 언제 bw.flush를 사용해야 하는가?
   BufferedWriter는 바로 출력 하지 않고, 버퍼(임시 저장소)에 모아둔다.
   프로그램 끝나기 직전에 출력하고자 할때 또는 중간에 반드시 출력해야 할 때
   (어떤 의미인지 아직 의미가 안 와닿음..)
*/
