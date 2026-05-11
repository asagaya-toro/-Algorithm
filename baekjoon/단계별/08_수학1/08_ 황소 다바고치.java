/* 
5/12(화) | Silver II 
소요 시간 30분 ~ 
   입력: 첫 번째 줄에 테스트 케이스의 갯수 T가 주어진다.
   두 번째 줄에 황소의 초기 체력을 나타내는 정수 n 과, 현재 가지고 있는 먹이의 갯수 m 입력
   출력: 황소가 며칠째 밤에 죽게 되는지 출력
*/

// 매일 밤에 황소의 체력이 절반으로 줄어든다. 
// 매일 낮에 먹이를 x개 줘서 체력을 x만큼 올릴 수 있음
// 일단 주어진 입력값 변수에 담기 
// T 만큼 반복문 돌리기 
// 초기체력에서 먹이를 더함, 현재 체력에서 나누기 절반을 함 
// 나누기 절반 한 값에서 먹이를 더하고, 나눔 
// 0이 될때 까지 반복하고, 그게 몇번 반복 되는지 count 

import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException{
        // Buffered 선언 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        // T, M(먹이 수), N 변수 선언 
        int T = Integer.parseInt(br.readLine()); 
        String arr[] = br.readLine().split(" "); 
        int N = Integer.parseInt(arr[0]); 
        int M = Integer.parseInt(arr[1]); 

        for (int i = 1; i <= T; i++ ){
            System.out.println(i);
            for (int j =N; j<0; j/=2){
                j +=1;
                        System.out.println("Hello, World!");
            }
        }
    }
}
// 8589934591 1
