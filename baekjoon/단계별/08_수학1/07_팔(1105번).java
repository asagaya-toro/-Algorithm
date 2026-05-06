/* 입력: 첫째 줄에 L과 R이 주어진다. 
   출력: 8이 가장 적게 들어있는 수에 들어있는 8의 개수
*/
// 소요시간 30분 ~
// L ~ R 사이에 8이 몇 개 있냐? 를 구하는 줄알았는데, 
// L ~ R 사이 수 중에 8이 가장 적게 들어있는 수를 찾고 (L또는 R에 8이 반드시 포함됨)
/// L과 R이 8이 포함되는 숫자인지 파악 
/// 포함 되면, 그 사이 8이 포함된 수가 몇개 나오는지 최솟값 구함 

import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException{
        // Buffered 선언 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String arr[] = br.readLine().split(" "); 
        // L과 R 선언 
        String L = arr[0]; 
        String R = arr[1]; 
        int result = 0; 

        for (int i = 0; i< L.length(); i++){
            if (L.charAt(i) == '8' && R.charAt(i) == '8' ){
                result ++; 
            }
        }
        System.out.println(result);
    }
}
