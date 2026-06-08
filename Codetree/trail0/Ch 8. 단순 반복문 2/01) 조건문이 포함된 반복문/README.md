# [[개념]조건문이 포함된 반복문](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-conditional-loops)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 2 / 조건문이 포함된 반복문](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 배열에서 특정 조건을 찾기 위해 사용 

| 패턴 | 사용 시점 |
|---|---|
| `if`만 | 조건 맞는 것만 처리, 나머지 스킵 |
| `if/else` | 모든 경우에 뭔가 해야 할 때 |
| `if/elif/else` | 3가지 이상 분기 |
| 중첩 `if` | 조건에 단계가 있거나 각 단계별 다른 처리가 필요할 때 |

---

## range() 기본 형태

```python
range(stop)              # 0 ~ stop-1
range(start, stop)       # start ~ stop-1
range(start, stop, step) # start ~ stop-1, step씩 증가/감소
```

```python
range(5)        # 0, 1, 2, 3, 4
range(1, 6)     # 1, 2, 3, 4, 5
range(1, 10, 2) # 1, 3, 5, 7, 9
range(10, 0, -1)# 10, 9, 8, ..., 1
```

> `range`는 끝값을 포함하지 않는다. N부터 100까지 포함하려면 `range(N, 101)`.

---

## 루프 변수 주의사항

입력값 변수와 루프 변수를 같은 이름으로 쓰면 덮어씌워진다.

```python
# Bad
N = 5
for N in range(N, 101):  # 루프 돌면서 N이 덮어씌워짐
    print(N)
print(N)  # 100 (원래 값 5 사라짐)

# Good
N = 5
for i in range(N, 101):  # 시작값 N, 루프 변수 i로 분리
    print(i)
```

> 루프 변수는 관례적으로 `i`, `j`, `k` 또는 의미있는 이름(`num`, `score`)을 사용. 입력값 변수와 같은 이름은 피한다.