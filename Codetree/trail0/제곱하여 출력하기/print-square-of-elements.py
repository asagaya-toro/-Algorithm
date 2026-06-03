# 문제: 제곱하여 출력하기
# 입력 : N개의 원소
# 출력 : 제곱한 결과 출력 
# 날짜: 2026/6/3 (수)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 

# 원소의 갯수 
N = int(input())
# 원소 
A = list(map(int, input().split(" ")))

# 출력 
for i in range(N) : 
    print(A[i]**2, end=" ")