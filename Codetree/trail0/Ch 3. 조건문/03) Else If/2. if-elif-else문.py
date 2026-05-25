# 문제: 살 수 있는 물건
# 입력 : 정수 n
# 출력 : 가격에 따라 살 수 있는 물건 출력
# 날짜: 2026/5/26 (화)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
n = int(input())

if n >= 3000 : 
    print("book")
elif n >= 1000 : 
    print("mask")
else : 
    print("no")