/*
백준 9498번 - 시험 성적
날짜: 2025/12/31 (수) | 소요시간: 5분

[접근 방식]
크게 고민한 부분은 없음
숏코딩, 꼭 if문을 사용해야 할까..
-> if - else if - else가 가장 적절, 조건이 많아서 삼항 연산자는 가독성이 떨어짐
첫번째 조건문에서 조건이 걸리기 때문에 (score >= 80) 이렇게 쓰는게 낫다.
-> score >= 80 && score < 90 굳이 써도 의미는 없음
*/

// 입력: 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
// 출력: 시험 성적을 출력한다
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 정수로 입력받을 점수 변수 선언
        int score = sc.nextInt();

        // 90 ~ 100점: A
        if (score >= 90) {
            System.out.print("A");
        }
        // 80 ~ 89점: B
        else if (score >= 80 && score < 90) {
            System.out.print("B");
        }
        // 70 ~ 79점: C
        else if (score >= 70 && score < 80) {
            System.out.print("C");
        }
        // 60 ~ 69점: D
        else if (score >= 60 && score < 70) {
            System.out.print("D");
        }
        // 나머지
        else {
            System.out.print("F");
        }
    }
}

/*
[복기]
😀 자바 조건문 종류
   1. if            : 조건이 참일 때만 실행
   2. if - else     : 둘 중 하나는 반드시 실행
   3. if - else if - else : 조건이 여러 개
   4. switch        : 조건이 범위가 아니라 정확한 값
   5. 삼항 연산자 ( ? : ) : 조건이 아주 단순
*/
