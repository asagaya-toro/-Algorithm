# 문제: 비교 연산
# 입력 : a,b 정수
# 출력 : 각각의 경우에 대해 참이라면 1을 ,거짓이라면 0 출력  
# 날짜: 2026/5/23 (토) 
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
A, B = map(int, input().split())

# 출력 
# A가 B보다 같거나 클 경우 
if A >= B : 
    print(1) 
else : 
    print(0)    
# A가 B보다 클 경우
if A > B : 
    print(1) 
else : 
    print(0)  
# B가 A보다 같거나 클 경우
if A <= B : 
    print(1) 
else : 
    print(0)  
# B가 A보다 클 경우
if A < B : 
    print(1) 
else : 
    print(0)  
# A와 B가 같을 경우 
if A == B : 
    print(1) 
else : 
    print(0)  
# A와 B가 다른 경우 
if A != B : 
    print(1) 
else : 
    print(0)   