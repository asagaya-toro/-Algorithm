# 문제: 점수 비교
# 입력 : A와 B의 수학과 영어의 점수
# 출력 : A가 B 보다 수학, 영어 점수 크면 1 아니면 0 출력 
# 날짜: 2026/5/30 (토)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
A_math, A_eng = map(int, input().split(" "))
B_math, B_eng = map(int, input().split(" "))

# 출력 
if (A_math > B_math) and (A_eng > B_eng) : 
    print("1")
else : 
    print("0")