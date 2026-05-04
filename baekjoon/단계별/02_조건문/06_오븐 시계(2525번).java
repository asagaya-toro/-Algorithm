/*
백준 2525번 - 오븐 시계
날짜: 2026/1/5~6 (월) | 소요시간: 40분
어떤 예외가 발생할지 생각할 것

[접근 방식]
요리시간을 더한 분을 먼저 구한다.
더한 요리시간을 시간과 분으로 환산
24시를 넘길 경우 생각
24로 나누어야 하는 이유 : 하루는 24시간
몫이 아닌 나머지를 쓰는 이유 : 몫은 하루가 몇번 지나갔는지, 나머지는 남은 시간
*/

// 입력: 첫째 줄에는 현재 시각이 나온다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
// 출력: 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 현재 시각과 요리시간 변수 선언
        int H = sc.nextInt();
        int M = sc.nextInt();
        int cooking = sc.nextInt();

        // 분에 요리시간을 더한다.
        M = M + cooking;

        // 더한 요리시간을 가지고 시간과 분으로 환산
        if (M >= 60) {
            H = H + M / 60;
            M = M % 60;

            // 24시를 넘길 경우
            if (H == 24) {
                H = 0;
            } else if (H > 24) {
                H = H % 24;
            }
        }

        System.out.print(H + " " + M);
    }
}

/*
[복기]
24시를 넘길 경우에 대한 예외를 생각하지 않았음
if (H >= 24) { H = H%24; } if문 하나만 쓸 수 있음.
*/
