# 문제: 두 배열의 곱
# 입력 : 3행 3열의 배열
# 출력 : 두 배열의 같은 위치에 있는 수의 곱을 출력
# 날짜: 2026/6/28 (일)
# 난이도 : 쉬움 | 소요시간: 15분

data = [[0] * 3 for _ in range(3)]

for i in range(3) :
    row_data = list(map(int, input().split(" ")))
    for j in range(3) : 
        data[i][j] = row_data[j]

# 빈 줄 입력 받기         
input()              

for i in range(3) :
    row_data = list(map(int, input().split(" ")))
    for j in range(3) : 
        row_data[j] *= data[i][j]  
        print(row_data[j], end=" ")
    print()