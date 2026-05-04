/*
백준 2884번 - 알람 시계
날짜: 2026/1/4 (일) | 소요시간: 25분

[접근 방식]
45분 보다 작을때와 클때 구분
45분 보다 작다면, 시간에서 -1을 빼야 하고, 시간이 자정인 경우 23시가 되야 한다.
45분 보다 작다면, -45이후 시간으로 표현 하기 위해 60을 더해야 한다.
*/

// 입력: 첫째 줄에 두 정수 H와 M이 주어진다.
// 출력: 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 시간, 분 변수 선언
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // 45분 보다 작을 때
        if (minute < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
            minute = 60 + (minute - 45);
        }
        // 45분 보다 클 때
        else {
            minute = minute - 45;
        }

        // 출력
        System.out.print(hour + " " + minute);
    }
}

/*
[복기]
백준 코테의 경우 어떤 예외 상황이 발생할지에 대해 자세히 알려줌.
실전에서는 어떤 예외 처리가 필요한지 혼자 생각해 내야 함..
*/
