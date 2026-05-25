# 문제: 등급 매기기
# 입력 : 정수 n
# 출력 : 점수에 따른 등급 출력 
# 날짜: 2026/5/26 (화)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
n = int(input())

# 출력 
if n >= 90 : 
    print("A")
elif n >= 80 : 
    print("B")
elif n >= 70 : 
    print("C")
elif n >= 60 : 
    print("D")
else : 
    print("F")