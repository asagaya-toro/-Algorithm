# 문제: B부터 A까지 감소
# 입력 : A,B 두 자연수
# 출력 : B부터 A까지 1씩 감소하며 그 값을 출력
# 날짜: 2026/5/28 (목)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
A,B = map(int, input().split())

# 출력 
for i in range(B,A-1, -1): 
    print(i, end=" ")