# [[개념]반복문 입문](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-loop-basics)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 1 / 반복문 입문](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### for문을 쓰는 이유

같은 작업을 반복할 때 코드를 줄이기 위해 사용한다.

```python
# for문 없이
print(1)
print(2)
print(3)

# for문으로
for i in range(1, 4):
    print(i)  # 훨씬 간결
```

---

### for문 종류별 쓰임새

| 형태 | 쓰는 상황 |
|------|----------|
| `for i in range(n)` | 인덱스 값이 필요할 때 |
| `for _ in range(n)` | 반복 횟수만 필요하고 인덱스는 안 쓸 때 |
| `for item in list` | 리스트·문자열 요소를 순서대로 꺼낼 때 |
| `for i, item in enumerate(list)` | 인덱스 + 요소 둘 다 필요할 때 |

---

### range() 옵션

```python
for i in range(5):        # 0, 1, 2, 3, 4
for i in range(1, 6):     # 1, 2, 3, 4, 5
for i in range(0, 10, 2): # 0, 2, 4, 6, 8  (step 지정)
```

---

### `for _ in range(n)` — 인덱스 없이 반복

```python
# 형식: 반복 횟수만 필요하고 i 값은 쓰지 않을 때
for _ in range(3):
    print("hello")
```

- `_`는 "이 값은 안 쓸 거야"라는 관례적 표현
- 코딩 테스트에서 입력 n번 받을 때 자주 등장