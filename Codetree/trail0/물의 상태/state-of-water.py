# 문제: 물의 상태 
# 입력 : 정수 n
# 출력 : 물의 온도에 따른 문자열 출력 
# 날짜: 2026/5/26 (화)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
n = int(input())

# 출력 
if n >= 100 : 
    print("vapor")
elif n < 0: 
    print("ice")
else : 
    print("water")