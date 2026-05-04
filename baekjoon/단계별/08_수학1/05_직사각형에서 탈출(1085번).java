/*
백준 1085번 - 직사각형에서 탈출
날짜: 2026/5/4 (월) | 소요시간: 30분

[문제 이해] 
경계선: 직사각형의 4개의 변(위, 아래, 왼쪽, 오른쪽 변 모두 포함)
직사각형의 경계선까지 가는 거리 = 한 테두리와 최단 거리 

[접근 방식]
첫째 줄 문자열 나누기 
int로 형변환 하여 변수 선언 
x, y, w-x, h-y 중 최소값 구하기 
*/

/* 입력: 첫째 줄에 x, y, w, h가 주어진다.
   출력: 직사각형의 경계선까지 가는 거리의 최솟값 출력 
*/
import java.io.*; 
public class Main {
    public static void main(String[] args)throws IOException {
        // Buffered 선언 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        // 첫째 줄 문자열 나누기 
        String arr[] = br.readLine().split(" ");
        // int로 형변환 하여 변수 선언 
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w_x = Integer.parseInt(arr[2])-x;
        int h_y = Integer.parseInt(arr[3])-y;
        // x, y, w-x, h-y 중 최소값 구하기 
        int result = Math.min(Math.min(x, w_x), Math.min(y, h_y));
        System.out.println(result);
    }
}

/*
[ai 일치률]
변수 선언이 다르지만, 거의 일치 
*/
