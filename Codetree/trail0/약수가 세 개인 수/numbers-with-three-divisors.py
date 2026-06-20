# 문제: 약수가 세 개인 수
# 입력 : 정수 start, end
# 출력 : 정수의 약수가 3개인 수의 개수 
# 날짜: 2026/6/18 (목)
# 난이도 : 쉬움 | 소요시간: 43 분
# 접근 : for문으로 start ~ end 까지 돌리고, 
# 약수 구하고 , if문으로 약수의 개수가 3개면, 3개인 수의 개수를 더해서 출력 

# 입력 
start, end = map(int, input().split())
result = 0

# start ~ end 까지 반복 
for i in range(start, end+1) : 
    cnt = 0
    for j in range(1, i+1) :
        if i % j == 0 :
            cnt +=1
    if cnt == 3 : 
        result += 1

print(result)

# 복기 
# 약수를 구하는 방법에 대해 생각 



# 복기 
# 약수 구하는 방법 ? 6 %2 = 3, 4 %2 =2 몫이 
# 근데 start ~ end까지 출력하려면 항상 무조건 +1 로 해줘야 하는건지 
# 다른 방법은 없는지 