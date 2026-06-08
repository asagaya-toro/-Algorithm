# 문제: 짝수만 거꾸로 출력하기
# 입력 : N개의 정수 
# 출력 : 주어진 순서의 역순으로 짝수만 출력
# 날짜: 2026/6/9 (화)
# 난이도 : 쉬움 | 소요시간: 5분
# 복기 : for문 역수 사용이 익숙하지 않음

# 입력 
N = int(input())
N_list = list(map(int, input().split(" ")))

# 출력 
for i in range(N-1, -1, -1) : 
    if (N_list[i] % 2 == 0) : 
        print(N_list[i], end=" ")
