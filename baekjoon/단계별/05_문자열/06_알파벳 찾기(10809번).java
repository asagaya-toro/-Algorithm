/*
백준 10809번 - 알파벳 찾기
날짜: 2026/2/21 (토) | 소요시간: 60분

[접근 방식]
S변수를 받는다. char? split?
출력해야 하는 배열은 총 26자리이다.
a가 있으면 그 a가 S 배열에서 몇번째 있는지 출력 해야 한다.
a는 알파벳 1번째 자리, 배열에는 0번째
b는 알파벳 2번째 자리, 배열에는 1번째 ...
arr[s.charAt(i)-'a'] = s.indexOf(s.charAt(i)); 도출
문자열을 전부 출력 해야 하니까 StringBuilder로

# ai는 for문을 두번만 사용하는 방법을 보여줌
Arrays.fill(arr, -1); 이런 메소드도 존재함,,
*/

/* 입력: 첫째 줄에 단어 S가 주어진다.
        단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
   출력: 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치,
        ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
        어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // S 문자열 받기
        String S = br.readLine();
        int arr[] = new int[26];

        // -1이 값인 배열 26자리 만들기
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        // 알파벳이 문자 배열의 몇 번째에 위치 하는지 찾기
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] = S.indexOf(S.charAt(i));
        }
        // 전체 알파벳 배열 출력을 위해 반복문 사용
        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        // 출력
        System.out.println(sb);
    }
}

/*
[복기]
✅ 반복문을 이렇게 많이 사용해야 하는가? X

✅ 자바에서 문자열 특정 위치 찾는 메소드
   1) indexOf('a')    : 못 찾으면 -1 반환
   2) lastIndexOf('a'): 마지막 등장 위치 찾아줌
   3) contains('a')   : boolean hasA = s.contains("a"); 위치가 아니라 존재 여부만 알고 싶을 때.

✅ Arrays.fill()란?
   배열 전체를 특정 값으로 한 번에 채우는 메서드

⭐️ 평소라면 ai에 힌트를 받아서 푸는 방법을 찾는데,
   오늘은 문제에서 어떤 걸 구해야 하는지, 출력에 어떤 패턴이 있는지 계속 생각해보았다.
   패턴을 찾고 보니 생각보다 푸는게 오래 걸리지 않았다.
   문제를 풀때 어떻게 풀어야 하는지 조금 감을 잡은거 같다,,,
*/
