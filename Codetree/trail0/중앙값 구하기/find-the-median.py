# 문제: 중앙값 구하기
# 입력 : 3개의 정수 A, B, C
# 출력 : 중앙값 출력 
# 날짜: 2026/5/31 (일)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
A, B, C = map(int, input().split(" "))
D = 0 

# 출력 
if A > B :
    D = B 
    B = A 
    A = D 
    if B > C : 
        D = C 
        C = B 
        B = C 
print (B)

