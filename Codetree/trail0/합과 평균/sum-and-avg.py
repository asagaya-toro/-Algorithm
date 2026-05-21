
# 문제: 합과 평균 
# 입력 : a,b 정수
# 출력 : 합과 평균 
# 날짜: 2026/5/22 (금) 
# 난이도 : 쉬움 | 소요시간: 1분 

# 입력 
A, B = map(int, input().split())

# 합과 평균 변수 선언 
hub = A+B 
avg = float(hub/2)

# 출력 
print(f"{hub} {avg:.1f}")
