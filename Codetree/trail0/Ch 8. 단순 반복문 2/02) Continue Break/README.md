# [[개념]Continue Break](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-continue-break)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 2 / Continue Break](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 10 XP |

--- 

### 🔄 반복문 제어: `continue` & `break`

---

### ✅ `break` — 반복문 **즉시 종료**

> 조건을 만족하는 순간, 반복문 전체를 빠져나옴

**사용하는 경우**
- 원하는 값을 찾았을 때 (검색 로직)
- 더 이상 반복할 필요 없을 때
- 무한루프(`while True`)의 탈출 조건

---

### ✅ `continue` — 현재 회차만 **건너뜀**

> 조건을 만족하는 순간, 현재 회차 나머지를 skip → 다음 반복으로 이동

**사용하는 경우**
- 특정 값만 제외하고 처리할 때
- 조건에 맞지 않는 항목 필터링

---

### 🔁 `while` 루프에서의 활용

```python
# break: 입력값이 0이면 종료
while True:
    n = int(input("숫자 입력: "))
    if n == 0:
        break
    print(f"입력값: {n}")

# continue: 짝수만 출력
i = 0
while i < 6:
    i += 1
    if i % 2 != 0:
        continue
    print(i)  # 2, 4, 6
```

---

### ⚠️ 중첩 반복문 주의

`break` / `continue`는 **가장 가까운 반복문 하나**에만 적용됨

```python
for i in range(3):
    for j in range(3):
        if j == 1:
            break       # 안쪽 for만 종료, 바깥 for는 계속
    print(f"i={i}")     # i=0, i=1, i=2 모두 출력됨
```
