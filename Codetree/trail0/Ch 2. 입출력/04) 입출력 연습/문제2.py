# 문제: 합과 평균의 차 
# 입력 : a,b 정수
# 출력 : 합과 평균, 합에서 평균을 뺀 값  
# 날짜: 2026/5/22 (금) 
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
a,b,c = map(int, input().split())

# 합과 평균 변수 선언 
hub = a+b+c
avg = int(hub/3)

# 출력 
print(hub)
print(avg)
print(hub-avg)

