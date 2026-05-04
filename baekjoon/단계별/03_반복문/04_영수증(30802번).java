/*
백준 30802번 - 영수증
날짜: 2026/1/13 (화) | 소요시간: 10분

[접근 방식]
고민했던 부분은 없음
총 금액, 수 변수를 선언하고, 수만큼 반복문을 돌린다.
반복문 안에서 각각의 물건 금액에 갯수만큼 곱하고 총합을 구한다.
총 합과 영수증 총 금액이 일치하는지 판단한다.
*/

/* 입력: 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
   둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
   이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
   출력: 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 총 금액, 종류 수 변수 선언
        int totalPrice = sc.nextInt();
        int totalCount = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= totalCount; i++) {
            // 물건 금액, 수 변수 선언
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum += (price * count);
        }

        // 총 금액과 영수증 금액 일치 판단
        if (totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
