/*
백준 1157번 - 단어 공부
날짜: 2026/3/9 (목~월) | 소요시간: 75분
(3/7(토), 3/8(일) 여러저러 잡생각이 많아서 그거 생각지운다고 안함)

[접근 방식]
대문자로 문자 받기
배열 출력된 만큼 카운트 하기
가장 많이 출력 되는 배열 찾기
가장 많이 출력 되는 배열 과 같은 숫자를 가지고 있는 배열 찾기
문자열이 여러개면 ? , 배열이 하나 나오면 그 문자열 출력
*/

/* 입력: 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다
   출력: 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
        단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine().toUpperCase();
        // 대문자 알파벳 배열
        int arr[] = new int[26];

        for (int i = 0; i < N.length(); i++) {
            arr[N.charAt(i) - 'A']++;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) max = arr[i];
        }

        String alphabet = "";
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                alphabet += String.valueOf((char) ('A' + i));
            }
        }
        System.out.println(alphabet.length() > 1 ? "?" : alphabet);
    }
}

/*
[복기]
✅ 배열 선언 종류
   // 1. 크기만 지정 (값은 자동으로 0)
   int[] arr = new int[5];

   // 2. 값으로 바로 초기화 (크기 자동)
   int[] arr = {1, 2, 3, 4, 5};

   // 3. new 키워드로 초기화
   int[] arr = new int[]{1, 2, 3, 4, 5};
*/
