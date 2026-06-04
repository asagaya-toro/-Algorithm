# 문제: 일의 자리 배열
# 입력 : 10 미만의 정수 두 개
# 출력 : 전전항과 전항의 합을 구하여 그 합
# 날짜: 2026/6/3 (수)
# 난이도 : 쉬움 | 소요시간: 15분

# 입력 
N = list(map(int, input().split(" ")))

# 배열 선언 
arry = [0] * 10

# 배열 고정값 선언 (💡append로 구현해도 될거 같음)
arry[0] = N[0]
arry[1] = N[1]

# 배열에 합 넣기  
for i in range(2, 10) :
    #💡(if문을 사용하지 않고, (arr[i - 2] + arr[i - 1]) % 10 이렇게 사용하는게 나음)
    arry[i] = arry[i-1] + arry[i-2]
    if arry[i] >=10 : 
        arry[i] = arry[i] -10  
        
# 출력 
for i in range(10): 
    print(arry[i], end=" ")              