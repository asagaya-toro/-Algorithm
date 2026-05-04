/*
백준 2480번 - 주사위 세개
날짜: 2026/1/7~9 (금) | 소요시간: 1시간 40분
결과가 몇가지 종류 일지 생각 할 것

[접근 방식]
처음에 모든 비교를 생각함
if (1 = 2 = 3)
    != 3
else if (1 !=2 = 3)
    != 3
else if (1 = 3 = 2)
    != 2
else if (1 !=3 = 2)
    != 2
else (1 !=2 !=3)
이렇게, 각각 if문을 비교 너무 많은 분기문이 필요하게 됨.
규칙이 아닌 비교에 집중함.

결론적으로 무엇을 비교해야 하는지 다시 생각
같은 눈이 3개? 10,000원+(같은 눈)×1,000
같은 눈이 2개? 1000 + (같은 눈) * 100
같은 눈이 0개? (그 중 가장 큰 눈)×100
= 상금 기준으로 경우의 수는 세가지 이다.

if (같은 눈이 세개 나온다)
else (같은 눈이 세개 나오지 않는다.)
    if (같은 눈이 두개 인가)
    else (다 다른 눈이다)
*/

// 입력: 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
// 출력: 첫째 줄에 게임의 상금을 출력 한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 주사위 변수
        int first_die = sc.nextInt();
        int second_die = sc.nextInt();
        int third_die = sc.nextInt();

        // 결과 변수
        int result;

        // 첫번째, 두번째, 세번째 숫자가 다 같은가
        if (first_die == second_die && first_die == third_die) {
            result = 10000 + first_die * 1000;
        }
        // 전부 같지 않다.
        else {
            /* 둘중 하나만 같을 경우
               첫번째 = 두번째
               첫번째 = 세번째
               두번째 = 세번째
            */
            if (first_die == second_die || first_die == third_die) {
                result = 1000 + first_die * 100;
            } else if (second_die == third_die) {
                result = 1000 + second_die * 100;
            }
            // 셋다 다른 경우
            else {
                // 최대값 구하기
                int max = Math.max(Math.max(first_die, second_die), third_die);
                result = max * 100;
            }
        }

        // 출력
        System.out.print(result);
    }
}

/*
[복기]
result의 경우가 몇개 인가 -> 3
결과가 같아지는 입력 패턴을 묶는다
그 묶음에 맞게 조건문을 만든다
단순하게 직관할 것 (출력의 경우의 수를 생각..)
*/
