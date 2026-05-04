/*
백준 25314번 - 코딩은 체육과목 입니다
날짜: 2026/1/14 (수) | 소요시간: 10분

[접근 방식]
문제가 너무 길어서 읽기 싫다고 생각함..
문제에 다른 불필요한 정보가 너무 많음.
➡️ 진짜 구해야 하는 문장만 뽑아내야 한다 생각
long int는 4바이트
long long int는 8바이트
long long long int는 16바이트...
4 바이트씩 늘어남.
➡️ 출력해야 하는 것
N바이트를 저장하려면 long을 몇 번 붙인 int를 써야 하는가

백준 코테는 가상의 문제이고,
실제로는 long long int 8바이트까지 쓴다고 함.
__int128  // 16바이트 (GCC, Clang 전용)
*/

// 입력: 첫 번째 줄에는 문제의 정수 N이 주어진다.
// 출력: 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // N: 자료형의 총 바이트 수 선언
        int n = sc.nextInt();

        // N 바이트를 표현하기 위해 i+=4
        for (int i = 4; i <= n; i += 4) {
            System.out.print("long ");
        }
        // 마지막에 자료형 기본 형태인 int 출력
        System.out.println("int");
    }
}
