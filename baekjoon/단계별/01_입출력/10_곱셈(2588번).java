/*
백준 2588번 - 곱셈
날짜: 2025/12/25 (목) | 소요시간: 10분

[접근 방식]
숫자를 잘라서 곱해야 겠다고 생각
변수 타입이 다르기 때문에 string을 int로 변환해서 곱해야 한다.
B.substring(2), B.substring(1,2), B.substring(0,1) 변수로 따로 선언 하는게 낫나..
*/

// 입력: 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
// 출력: 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 입력
        Scanner sc = new Scanner(System.in);

        // 자연수 변수 선언
        int A = sc.nextInt();
        String B = sc.next();

        // 출력
        System.out.println(A * Integer.parseInt(B.substring(2)));
        System.out.println(A * Integer.parseInt(B.substring(1, 2)));
        System.out.println(A * Integer.parseInt(B.substring(0, 1)));
        System.out.println(A * Integer.parseInt(B));
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
