# 문제: A부터 B까지 짝수의 합
# 입력 : 정수 A, B 
# 출력 : A 부터 B 까지 짝수의 합 
# 날짜: 2026/6/10 (수)
# 난이도 : 쉬움 | 소요시간: 3분
# 접근: 반복문을 돌며 짝수일 때 더하고 그 합계를 구해야겠다. 

# 입력 
A, B = map(int, input().split(" "))
total = 0

# A 부터 B까지 짝수를 더한다.  
for i in range(A, B+1) : 
    if i % 2 == 0 : 
        total += i

# 출력 
print(total)