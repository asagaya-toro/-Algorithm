# 문제: 특정 수 맞히기
# 입력 : 정수 N
# 출력 : 25 가 나올때 까지 출력 
# 날짜 : 2026/6/13 (토)
# 난이도 : 쉬움 | 소요시간: 5분
# 접근 : 몇 개 수가 주어질 지 모르니 반복문 안에 입력문을 작성해야 하고, 
# 25가 나오면 break  

# 입력 과 반복문 
while True : 
    N = int(input())
    if N > 25 : 
        print("Lower")
    elif N < 25 : 
        print("Higher")
    elif N == 25 : 
        print("Good")
        break
