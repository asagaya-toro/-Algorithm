# 문제: 배열의 값을 3배로
# 입력 : 3행 3열의 배열
# 출력 : 모든 원소를 3배로 만든 뒤 배열을 그대로 출력
# 날짜: 2026/6/28 (일)
# 난이도 : 쉬움 | 소요시간: 15분
# 접근 : for문을 돌리며 배열을 입력 받아야 함, 그리고 새 배열 변수에 추가 

# 배열 변수 
for i in range(3) : 
    row_data = list(map(int, input().split(" ")))
    for j in range(3) : 
        row_data[j] *= 3
        print(row_data[j], end=" ")
    print()
