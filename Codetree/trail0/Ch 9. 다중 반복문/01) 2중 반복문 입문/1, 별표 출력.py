# 문제: 직사각형 별표 출력하기
# 입력 : 정수 N, M 
# 출력 : 별표로 이루어진 직사각형을 출력
# 날짜: 2026/6/14 (일)
# 난이도 : 쉬움 | 소요시간: 5분

# 입력 
N, M = map(int,input().split(" "))

# 출력 
for i in range(N) : 
    for i in range(M) : 
        print("*", end = " ")
    print()