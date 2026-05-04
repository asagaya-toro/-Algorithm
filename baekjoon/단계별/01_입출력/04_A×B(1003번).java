/*
백준 1003번 - A×B
날짜: 2025/12/14 (일) | 소요시간: 3분

[접근 방식]
어제랑 유형이 같아서 고민한 것은 없다.
어제 잘 몰랐던 부분들을 생각하며, 코드 작성.
오탈자가 줄음
*/

// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너로 입력 선언
        Scanner sc = new Scanner(System.in);

        //A, B 선언
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 출력
        System.out.print(A * B);
    }
}
