/*
백준 3052번 - 나머지
날짜: 2026/2/11 (화~수) | 소요시간: 80분

[접근 방식]
겹치면,,? 겹치지 않으면 ..? 어떻게 할지 생각정리가 안됨..
무엇과 무엇을 비교해서 결과를 내면 되는지 한참을 생각함..
그걸 어떻게 비교 할 것인가에 대해서도 한참을 생각함.
*/

/* 문제: 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
        수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
        그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
   출력: 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];

        // 모든 수 반복하며 42와 나눈 수를 배열에 담는다.
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            int B = A % 42;
            arr[i] = B;
        }
        // 무엇을 세야 하는가?
        // 서로 다른 값의 갯수
        // 무엇과 무엇을 비교 ? 해서 값이 다른지 알수 있는거지?
        int result = 0;
        for (int i = 0; i < 10; i++) {
            boolean same = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    same = true;
                }
            }
            if (!same) {
                result++;
            }
        }
        System.out.println(result);
    }
}

/*
[복기]
✅ 문제를 풀 때 생각 순서
   최종적으로 구해야 하는 것 먼저 확인
   : 서로 다른 나머지의 개수
   언제 개수를 증가시킬 것인가?
   : 처음 등장한 값일 때만 +1
   비교 대상 정하기
   : 처음 등장했는지 어떻게 아는가?
   : 이전에 나온 값들과 비교
*/
