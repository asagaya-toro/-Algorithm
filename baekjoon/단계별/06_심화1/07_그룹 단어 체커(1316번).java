/*
백준 1316번 - 그룹 단어 체커
날짜: 2026/3/15 (금~일) | 소요시간: 90분
(토요일 안했어요..)

[접근 방식]
결국 같은 문자가 뒤에 또 나오는지 안나오는지 확인하는거네?
단어의 갯수 N 출력
단어 갯수만큼 for 문, 단어 글자수 만큼 for문
연속은 가능한데, 뒤에 다시 나오는건 불가능 하다.
한번 나왔던 문자를 어떻게 알지?
새로운 문자가 나오기 전 문자를 배열에 등록하고, 그 문자랑 같으면 break, 아니면 +1
*/

/* 입력: 첫째 줄에 단어의 개수 N이 들어온다.
        둘째 줄부터 N개의 줄에 단어가 들어온다.
        단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
   출력: 첫째 줄에 그룹 단어의 개수를 출력한다.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        // 단어 갯수만큼 for 문, 단어 글자수 만큼 for문
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int[] arr = new int[26];
            boolean isGroup = true;

            for (int j = 1; j <= word.length() - 1; j++) {
                if ((word.charAt(j) != word.charAt(j - 1))) {
                    if (arr[word.charAt(j) - 'a'] == 1) {
                        isGroup = false;
                        break;
                    }
                    arr[word.charAt(j - 1) - 'a'] = 1;
                }
            }
            if (isGroup) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
