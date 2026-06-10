# 문제: 배수의 개수
# 입력 : 10개의 수
# 출력 : 3의 배수의 개수와 5의 배수의 개수를 출력
# 날짜: 2026/6/11 (목)
# 난이도 : 쉬움 | 소요시간: 3분
# 접근: for 문으로 10개의 수를 돌고, if 문으로 3, 5일 때 cnt 세기 

# 입력 
cnt_3 = 0
cnt_5 = 0

# 입력문에서 3과 5의 배수 갯수 출력 
for i in range(10) : 
    N = int(input())
    if N % 3 == 0 and N % 5 == 0: 
        cnt_3 += 1 
        cnt_5 += 1 
    elif N % 3 == 0 : 
        cnt_3 += 1 
    elif N % 5 == 0 : 
        cnt_5 +=1 
    else : 
        continue

# 출력
print(cnt_3, cnt_5)