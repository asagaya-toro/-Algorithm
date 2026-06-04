# 문제: 더 긴 문자열
# 입력 : -
# 출력 : 더 긴 단어와 길이를 출력
# 날짜: 2026/6/5 (금)
# 난이도 : 쉬움 | 소요시간: 3분 

# 입력 
A, B = input().split(" ")

# 출력 
if len(A) > len(B) : 
    print(A, len(A))
elif len(A) < len(B) : 
    print(B, len(B))
else : 
    print("same")