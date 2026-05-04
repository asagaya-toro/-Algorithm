/*
백준 1001번 - A-B
날짜: 2025/12/13 (토) | 소요시간: 5분

[접근 방식]
어제랑 유형이 같아서 고민한 것 없음
어제 코드 참고하지 않고 기억나는 대로 전부 적어봄
*/

// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A - B);
    }
}

/*
[복기]
😀 new Scanner(System.in) 에서 System.in을 작성하는 이유? 
Scanner 안에 들어갈 수 있는 것
① InputStream (입력 통로)
→ “어디선가 흘러 들어오는 데이터”를 읽을 때 사용.
System.in = “키보드에서 들어오는 값”이 흐르는 파이프
new Scanner(System.in);  / new Scanner(socket.getInputStream());

② File (파일)
→ “파일 안의 글자들을 읽어라.”
new Scanner(new File("data.txt"));

③ String (문자열 자체)
→ “문자열을 입력처럼 취급해 읽어라.”
new Scanner("123 456 hello");

😀 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10) 이 조건을 넣은 이유는 뭘까? 
문제를 푸는 사람이 입력 값의 범위를 정확히 알도록 하기 위해 존재

😀 nextInt();
next → “다음 데이터를 읽어라”
Int → “정수(int) 형태로 읽어라”
*/
