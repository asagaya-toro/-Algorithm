# 문제: 비교에 따른 연산
# 입력 : a,b 정수
# 출력 : 비교 결과에 따라 연산 
# 날짜: 2026/5/25 (월) 
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
a,b = map(int, input().split())

# 출력 
if a > b :
    print(a*b)
else :
    print(int(b/a))