# 문제: 숫자 피라미드 2 
# 입력 : 정수 N
# 출력 :  i 번째 줄에 i개의 수를 출력
# 날짜: 2026/6/21 (일)
# 난이도 : 쉬움 | 소요시간:  분
# 접근 : 반복문을 돌며 더한 숫자를 출력 해야 함 
# 더한 숫자 변수 필요 

# 입력 
N = int(input())
cnt = 0

# 출력 
for i in range (1, N+1) : 
    for j in range (i) : 
        cnt += 1
        print(cnt, end = " ")
    print()
