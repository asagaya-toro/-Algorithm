# 문제: 남녀노소 구분짓기
# 입력 : 자연수 
# 출력 : MAN, WOMAN, BOY, GIRL을 구분하여 출력
# 날짜: 2026/5/31 (일)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
sex = int(input())
age = int(input())

# 출력 
if sex == 1 : 
    if age >= 19 : 
        print("WOMAN")
    else : 
        print("GIRL")
else : 
    if age >= 19 : 
        print("MAN")
    else : 
        print("BOY")
