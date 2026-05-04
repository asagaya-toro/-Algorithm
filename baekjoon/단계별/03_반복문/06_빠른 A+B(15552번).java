/*
백준 15552번 - 빠른 A+B
날짜: 2026/1/15~16 (금) | 소요시간: 50분

[접근 방식]
마찬가지로 지문이 길어서 진짜 봐야 하는 문장만 뽑음
// for 을 쓰면 시간 초과가 날 수 있으니 BufferedReader을 사용해라
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
// 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
테스트 케이스 수를 먼저 선언한다.
for문 반복문 안에 A+B 더한걸 차례대로 구한다.
br.readLine로 한 줄씩은 나눌 수 있지만, 공백을 알아서 나눠 주지는 않는다.
한 줄안에 공백을 기준으로 나눠야 한다.
결과를 담고, bw.flush로 출력한다.
*/

/* 입력: 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
   다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
   출력: 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수
        String line = br.readLine();
        int T = Integer.parseInt(line);

        // for 반복문 (A+B) 출력
        for (int i = 1; i <= T; i++) {
            String line2 = br.readLine();
            // 공백을 기준으로 나누기
            String array[] = line2.split(" ");
            // A와 B 선언
            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);
            // A+B 담기
            String result = String.valueOf(A + B);

            bw.write(result);
            bw.newLine();
        }
        // 출력
        bw.flush();
    }
}

/*
[복기]
😀 BufferedReader / BufferedWriter
   자바의 입출력(IO) 클래스
   입출력 속도를 빠르게 하기 위해 사용
   내부에 버퍼(Buffer, 임시 저장 공간)를 사용하여 입력·출력을 한 글자씩 하지 않고,
   한꺼번에 모아서 처리하는 도구

😀 Scanner / System.out.println
   입력을 하나하나 처리하며 내부적으로 정규식 처리까지 하여 느리다.

😀 String line = br.readLine(); 선언은 왜 필요한가.
   BufferedReader.readLine()의 반환값 타입 → String
   String을 다시 int로 반환하기 위해 선언함
   int T = Integer.parseInt(br.readLine()); 한줄로 쓸 수도 있음.

😀 String line2 = br.readLine(); 왜 반복문 안에서 다시 선언 해야 하는가.
   br.readLine()은 한 줄 읽고 끝이기 때문에, 다음 줄을 읽으려면 다시 호출해야 한다.

😀 BufferedWriter란?
   출력을 버퍼에 모아두었다가 한 번에 출력하는 도구 (빠름)
   System.out.println → 호출할 때마다 바로 출력 (느림)

😀 String array[] = line2.split(" ");로 나눠야 하는 이유
   Scanner와 같이 공백을 기준으로 자동으로 나눠주지 않음.
   BufferedReader은 한 줄 전체를 문자열로만 읽음

😀 bw.write(result);은 string만 받는가?
   BufferedWriter.write()는 문자 단위 출력
   숫자는 출력 불가하기 때문에 형변환 필요

😀 throws Exception 혹은 throws IOException 사용 이유
   BufferedReader, BufferedWriter는 외부(운영체제·파일·네트워크)와 통신하기 때문에
   입출력 오류 가능성이 있다.
   참고로 Exception은 IOException보다 큰(상위) 개념 (정처기할때 나옴)
*/
