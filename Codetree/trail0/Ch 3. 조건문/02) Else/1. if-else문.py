# 문제: 시험 통과 여부 확인하기 
# 입력 : N
# 출력 : 점수에 따라 메시지 출력 
# 날짜: 2026/5/25 (일) 
# 난이도 : 쉬움 | 소요시간: 1분 

# 입력 
N = int(input())

# 출력 
if N >= 80 :
    print("pass")
else :
    print(80-N, "more score")