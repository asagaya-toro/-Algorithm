# 문제: 숫자 피라미드
# 입력 : 정수 N
# 출력 : i 번째 줄에 i개의 i를 출력
# 날짜: 2026/6/18 (목)
# 난이도 : 쉬움 | 소요시간: 1분
# 접근 : 다중 반복문 i 번째 돌리며, i를 i번 출력 

# 입력 
N = int(input())

# 출력 
for i in range(1, N+1) : 
    for j in range (0, i) : 
        print(i, end=" ")
    print()