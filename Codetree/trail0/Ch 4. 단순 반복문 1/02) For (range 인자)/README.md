# [[개념]For 퀴즈](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-for)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 1 / For](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

## `range()` 인자 개수별 동작

### 인자 1개 — `range(stop)`

```python
for i in range(5):
    print(i)  # 0 1 2 3 4
```

0부터 stop-1까지 순회한다.

### 인자 2개 — `range(start, stop)`

```python
for i in range(2, 6):
    print(i)  # 2 3 4 5
```

start부터 stop-1까지 순회한다. i의 첫 값 = start.

### 인자 3개 — `range(start, stop, step)`

```python
for i in range(0, 10, 2):
    print(i)  # 0 2 4 6 8
```

start부터 stop-1까지, step 간격으로 순회한다.

> **핵심 규칙:  stop에 쓴 숫자 바로 앞까지만 돎 / 인자 최대 3개**


---

## 음수 사용

### start / stop에 음수

```python
for i in range(-3, 2):
    print(i)  # -3 -2 -1 0 1
```

### step에 음수 (역순)

```python
for i in range(5, 0, -1):
    print(i)  # 5 4 3 2 1
```

> ⚠️ step이 음수일 때는 **start > stop** 이어야 한다.
> 반대 방향이면 아무것도 출력되지 않는다.

```python
for i in range(0, 5, -1):
    print(i)  # 아무것도 출력 안 됨
```