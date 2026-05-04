/*
백준 10869번 - 나머지
날짜: 2025/12/22 (월) | 소요시간: 5분

[접근 방식]
하나씩 출력 해야 했기 때문에 println()
*/

// 입력: 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
// 출력: 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력
        Scanner sc = new Scanner(System.in);

        // A, B, C 선언
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 출력
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}

/*
[복기]
(A×B)%C 여기서 그대로 X 를 써서 에러가 남 .. 좀더 주의해서 볼 수 있도록 ..
*/
