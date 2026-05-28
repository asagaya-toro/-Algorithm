# [[개념]While](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-while)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 1 / While](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

## `while` 이란?

조건이 참(True)인 동안 코드 블록을 반복 실행하는 반복문이다.
조건이 거짓(False)이 되는 순간 루프를 빠져나온다.

---

## 기본 구조

```python
while 조건:
    실행할 코드
    # 조건을 변화시키는 코드
```

```python
count = 0

while count < 3:
    print(count)  # 0 1 2
    count += 1
```

> **핵심 규칙: 조건을 바꾸는 코드가 없으면 무한루프 / 조건이 False가 되는 순간 종료**

---

## `while` vs `for`

| | `for` | `while` |
|---|---|---|
| 반복 기준 | 횟수 / 범위 | 조건 |
| 언제 씀 | 반복 횟수가 정해진 경우 | 언제 끝날지 모를 때 |

```python
# for - 5번 반복
for i in range(5):
    print(i)  # 0 1 2 3 4

# while - 5보다 작은 동안 반복
i = 0
while i < 5:
    print(i)  # 0 1 2 3 4
    i += 1
```

---

## 제어 키워드

### `break` — 조건 무관하게 즉시 탈출

```python
while True:
    user = input("입력: ")
    if user == "q":
        break  # q 입력 시 루프 종료
```

### `continue` — 이번 회차만 건너뜀

```python
i = 0
while i < 5:
    i += 1
    if i == 3:
        continue     # 3일 때 print 건너뜀
    print(i)         # 1 2 4 5
```

> ⚠️ `continue` 앞에 `i += 1` 이 없으면 i가 영원히 3에서 멈춰 무한루프가 된다.