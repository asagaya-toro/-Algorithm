# [[개념]중첩 조건문](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-nested-if)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 조건문 2 / 중첩 조건문](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 파이썬 중첩 if문

if 안에 또 다른 if가 들어가는 구조.

```python
if 조건1:
    if 조건2:
        # 조건1 AND 조건2 둘 다 참
    else:
        # 조건1만 참
else:
    # 조건1이 거짓
```

---

### 주의할 것

> ⚠️ 3단계 이상 중첩되면 가독성이 급격히 떨어짐

```python
# ❌ 너무 깊은 중첩
if a:
    if b:
        if c:
            do_something()

# ✅ 조기 반환으로 평탄하게
if not a:
    return
if not b:
    return
do_something()
```

---

### 버블 정렬 (Bubble Sort)

인접한 두 값을 비교해서 큰 값을 오른쪽으로 밀어내는 걸 반복하는 정렬 방식.

---

### 동작 방식

```
[5, 3, 8, 1] 정렬 과정

1회전
5 3 → 교환 → [3, 5, 8, 1]
5 8 → 그대로 → [3, 5, 8, 1]
8 1 → 교환 → [3, 5, 1, 8]  ← 8 확정

2회전
3 5 → 그대로 → [3, 5, 1, 8]
5 1 → 교환 → [3, 1, 5, 8]  ← 5 확정

3회전
3 1 → 교환 → [1, 3, 5, 8]  ← 정렬 완료
```

한 회전마다 가장 큰 값이 맨 뒤로 확정됨.

---

### 코드

```python
arr = [5, 3, 8, 1]
n = len(arr)

for i in range(n - 1):
    for j in range(n - 1 - i):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

print(arr)  # [1, 3, 5, 8]
```
