# 문제: 100점 도달하기
# 입력 : 점수 N 
# 출력 : 100점까지 1점씩 증가하며 각 점수가 어떤 등급에 해당하는지 출력
# 날짜: 2026/6/8 (월)
# 난이도 : 쉬움 | 소요시간: 3분
# 복기 : 문제 자체는 쉽긴 한데 for문 사용법이 익숙 하지 않음.

# 입력 
N = int(input()) 

# 반복 조건문 출력 
for i in range(N, 101) : 
    if (i >= 90) : 
        print("A" , end=" ") 
    elif (i >= 80) : 
        print("B", end=" ") 
    elif (i >= 70) : 
        print("C", end=" ") 
    elif (i >= 60) : 
        print("D", end=" ") 
    else : 
        print("F", end=" ") 


