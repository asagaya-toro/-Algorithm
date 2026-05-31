# 문제: 윤년인가
# 입력 : 자연수 Y를 입력받아 Y 
# 출력 : 윤년이면 true, 아니면 false 
# 날짜: 2026/5/31 (일)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
Y = int(input())

# 출력 
if Y % 4 == 0 : 
    if Y % 100 == 0 and Y % 400 != 0 : 
        print("false") 
    else: 
        print("true")
else : 
    print("false")