# 문제: 짝수의 합 n번 구하기
# 입력 : 정수 N, a, b
# 출력 : a부터 b까지의 짝수를 모두 합한 결과를 출력
# 날짜: 2026/6/18 (목)
# 난이도 : 쉬움 | 소요시간: 3분
# 접근 : if문으로 a ~ b사이의 짝수 구하고, cnt로 다 더하기 

# 입력 
N = int(input())

# N 만큼 반복 
for _ in range(N) :
    # a, b, 합계 변수 선언 
    a,b = map(int,input().split(" "))
    cnt = 0

    # 짝수인 경우 합계를 구하기
    for i in range(a, b+1) : 
        if i % 2 == 0 : 
            cnt +=i
    # 출력 
    print(cnt)

