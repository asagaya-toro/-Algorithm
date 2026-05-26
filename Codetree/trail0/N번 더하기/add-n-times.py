# 문제: N번 더하기
# 입력 : A,N 정수 
# 출력 : A에 N을 더하는 과정을 N번 반복한 연산 결과
# 날짜: 2026/5/27 (수) 
# 난이도 : 쉬움 | 소요시간: 1분 

# 입력 
A, N = map(int,input().split())

# 출력 
for i in range(N) : 
    A += N
    print(A) 