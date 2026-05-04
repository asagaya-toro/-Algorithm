/*
백준 11382번 - 꼬마 정민
날짜: 2025/12/26 (금) | 소요시간: 40분

[접근 방식]
숫자를 잘라서 곱해야 겠다고 생각
변수 타입이 다르기 때문에 string을 int로 변환해서 곱해야 한다.
B.substring(2), B.substring(1,2), B.substring(0,1) 변수로 따로 선언 하는게 낫나..
*/

// 입력: 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
// 출력: A+B+C의 값을 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력 받기
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        long[] arr = new long[3];

        // 공백을 기준으로 배열에 담기
        arr[0] = sc.nextLong();
        arr[1] = sc.nextLong();
        arr[2] = sc.nextLong();

        // 출력
        System.out.print(arr[0] + arr[1] + arr[2]);
    }
}

/*
[복기]
😀 substring, charAt, Arrays.copyOfRange 의 차이
   substring           — "문자열 여러 글자"
   charAt              — "문자 딱 하나"
   Arrays.copyOfRange  — "배열 자르기"

   현재는 문자 딱 하나만 자르기 때문에 charAt()의 경우가 더 깔끔함
*/
