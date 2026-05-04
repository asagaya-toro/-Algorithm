/*
백준 2941번 - 크로아티아 알파벳
날짜: 2026/3/12 (목) | 소요시간: 80분

[접근 방식]
크로파타니아 알파벳이 뭐지
입력 선언
크로아티아 알파벳 배열 선언
알파벳 입력 선언 길이 만큼 반복문을 돌려야 겠다.
알파벳 안에 크로아티아 알파벳이 포함 되어있는지 찾아야 한다.
indexOf를 생각했지만, indexOf는 순서대로가 아닌 임의의 순서로 하니까 찾기 힘들거 같다.
startsWith로 순서대로 찾아가며 존재 하면 그 길이 만큼 반복문을 건너 뛴다.
크로아티아 배열이 존재하면 +1, 존재 하지 않아도 +1
*/

/* 입력: 첫째 줄에 최대 100글자의 단어가 주어진다.
        알파벳 소문자와 '-', '='로만 이루어져 있다.
   출력: 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 선언
        String alphabet = br.readLine();
        // 크로아티아 알파벳 배열
        String cAlphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int result = 0;
        for (int i = 0; i < alphabet.length();) {
            boolean found = false;
            for (int j = 0; j < cAlphabet.length; j++) {
                if (alphabet.startsWith(cAlphabet[j], i)) {
                    i += cAlphabet[j].length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                i += 1;
            }
            result += 1;
        }
        System.out.println(result);
    }
}

/*
[ai일치률]
found부분은 ai에 질문해서 문제 해결함
for문을 언제 멈추는지, result를 언제 +1해야 하는지도 ai에 질문,,
다음에는 좀 더 고민해보자..
*/
