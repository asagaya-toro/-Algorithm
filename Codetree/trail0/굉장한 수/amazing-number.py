# 문제: 굉장한 수
# 입력 : 자연수 N
# 출력 : 입력받은 수가 굉장한 수라면 true, 아니면 flase
# 날짜: 2026/5/30 (토)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
n = int(input())

# 출력 
if (n%2 == 1 and n %3 == 0) or (n%2 == 0 and n%5 ==0) : 
    print("true")
else : 
    print("false") 