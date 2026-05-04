/*
백준 14681번 - 사분면 고르기
날짜: 2026/1/3 (토) | 소요시간: 7분

[접근 방식]
if - else if - else가 가장 적절
제 n사분면에 어떤 기준으로 나뉘는가에 대해 생각
1사분면 (양수, 양수)
2사분면 (음수, 양수) ...
정수의 숫자에 제한이 있으니까 long?
Scanner은 줄바꿈 기능도 있으니까 굳이 x,y둘다 선언할 필요가 없는가?
-> 배열로 받을 수 있지만, 지금은 2개 입력 받는 상황이라 따로 선언이 가독성 좋음
*/

// 입력: 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다.
// 출력: 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // x와 y 선언
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 제 1사분면 (x:양수, y:양수)
        if (x > 0 && y > 0) {
            System.out.print("1");
        }
        // 제 2사분면 (x:음수, y:양수)
        else if (x < 0 && y > 0) {
            System.out.print("2");
        }
        // 제 3사분면 (x:음수, y:음수)
        else if (x < 0 && y < 0) {
            System.out.print("3");
        }
        // 제 4사분면 (x:양수, y:음수)
        else {
            System.out.print("4");
        }
    }
}

/*
[복기]
😀 int와 long의 범위
   int  : -2,147,483,648 ~ 2,147,483,647
   long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
   (너무 남발하면 메모리 조금 더 쓰고 속도 약간 느려질 수도 있음)
*/
