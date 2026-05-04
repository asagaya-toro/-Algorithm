/*
백준 25206번 - 너의 평점은
날짜: 2026/3/17 (월~화) | 소요시간: 50분

[접근 방식]
문제가 너무 길어 읽기 싫다 생각함
20번 반복
공백을 기준으로 나누어서 배열로 변수 선언
두번째 배열이 P이면 continue
첫번째 배열의 수 × 과목평점 전부 더하기
첫번째 배열의 수 전부 더하기
나누기
*/

/* 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
   등급이 P인 과목은 계산에서 제외
   입력: 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
   출력: 전공평점을 출력
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffer선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학점별 점수 배열 선언
        Map<String, String> map = new HashMap<>();
        map.put("A+", "4.5");
        map.put("A0", "4.0");
        map.put("B+", "3.5");
        map.put("B0", "3.0");
        map.put("C+", "2.5");
        map.put("C0", "2.0");
        map.put("D+", "1.5");
        map.put("D0", "1.0");
        map.put("F", "0.0");

        // 결과값 변수 선언
        double result = 0;
        double hap = 0;

        // 20번 반복
        for (int i = 0; i < 20; i++) {
            String arr[] = br.readLine().split(" ");
            // P일 경우 제외
            if (arr[2].equals("P")) {
                continue;
            } else {
                String value = map.get(arr[2]);
                result += Double.parseDouble(arr[1]) * Double.parseDouble(value);
                hap += Double.parseDouble(arr[1]);
            }
        }
        System.out.println(result / hap);
    }
}

/*
[ai일치률]
학점별 점수를 상수 클래스로 따로 선언함

[복기]
✅ 상수를 따로 빼는 이유
   여러 클래스에서 재사용 가능
   등급 기준이 바뀌면 한 곳만 수정하면 됨
   코드 읽기가 명확

✅ map 사용법
   key-value 쌍으로 데이터를 저장할때 사용

   Map<String, String> map = new HashMap<>();
   map.put("A+", "4.5");          // 넣기
   map.get("A+");                  // 가져오기 → "4.5"
   map.containsKey("A+");          // key 존재 여부 → true

✅ foreach 사용법
   컬렉션을 순회할 때 사용
   map.forEach((key, value) -> {
       System.out.println(key + " " + value);
   });

✅ 람다 안에서 외부 변수 변경 불가
   람다는 외부 변수를 읽기만 가능하고 변경은 불가
*/
