# 문제: 정상적인 구구단
# 입력 : 정수 N
# 출력 : N×N모양 구구단을 출력
# 날짜: 2026/6/17 (수)
# 난이도 : 쉬움 | 소요시간: 3분
# 접근 : 다중 반복문 사용 (첫번째: 1~3, 두번째: 1~3)

# 입력 
N = int(input())

# N 만큼 다중 반복하며 출력 
for i in range(1, N+1) : 
    for j in range(1, N+1) : 
        if j == N : 
            print(f"{i} * {j} = {i*j}", end ="" )
        else: 
            print(f"{i} * {j} = {i*j}", end =", " )
    print()