# [[개념]1차원 배열 응용](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-1d-array-iteration)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 1차원 배열 / 1차원 배열 응용](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 1. map 객체 vs list(map(...))

- `map()`은 리스트가 아닌 **이터레이터(iterator)** 를 반환
- 이터레이터는 값을 미리 저장하지 않고, **요청할 때마다 하나씩** 꺼내주는 방식
- 인덱스(`a[i]`) 접근이 필요하면 반드시 `list()`로 감싸야 함

```python
a = map(int, input().split())         # map 객체 (이터레이터)
b = list(map(int, input().split()))   # 리스트
```

| | `map(...)` | `list(map(...))` |
|---|---|---|
| 타입 | map 이터레이터 | list |
| `a[i]` 인덱스 접근 | ❌ TypeError | ✅ |
| `for` 순회 | ✅ | ✅ |
| 언패킹 `a, b =` | ✅ | ✅ |
| 메모리 | 값을 미리 저장 안 함 | 값을 전부 저장 |

> 💡 인덱스 접근이 필요하면 항상 `list(map(...))`으로 사용

---

### 2. 리스트 특성

#### 크기 지정 없이 선언 가능

- 파이썬 리스트는 **동적 배열**로, 선언 시 크기를 지정하지 않아도 됨
- `append()` 등으로 요소를 추가하면 내부적으로 메모리를 **자동으로 확장**
- Java처럼 크기를 초과하면 에러가 나는 구조가 아님

```python
arr = []
arr.append(1)    # [1]
arr.append(2)    # [1, 2]
arr.append(100)  # [1, 2, 100]
```

> 💡 단, 처음부터 특정 인덱스에 접근하려면 `[0] * n` 으로 크기를 잡아두어야 함
> ```python
> arr = []
> arr[2] = 5    # ❌ IndexError
>
> arr = [0] * 5
> arr[2] = 5    # ✅ [0, 0, 5, 0, 0]
> ```

#### 리스트 vs 튜플

| | 리스트 `[]` | 튜플 `()` |
|---|---|---|
| 변경 가능 여부 | ✅ 변경 가능 (mutable) | ❌ 변경 불가 (immutable) |
| 선언 | `a = [1, 2, 3]` | `a = (1, 2, 3)` |
| 인덱스 접근 | ✅ | ✅ |
| `for` 순회 | ✅ | ✅ |
| 요소 추가/삭제 | ✅ `append()`, `pop()` | ❌ |
| 언패킹 | ✅ | ✅ |

#### 튜플을 쓰는 경우

```python
# 1. 언패킹 — 가장 자주 쓰는 패턴
a, b = (1, 2)
a, b = 1, 2      # 괄호 생략도 가능, 내부적으로는 튜플

# 2. 함수에서 여러 값 반환
def min_max(arr):
    return min(arr), max(arr)   # 튜플로 반환됨

lo, hi = min_max([3, 1, 4, 1, 5])

# 3. 변경되면 안 되는 고정값
DIRECTION = ((-1, 0), (1, 0), (0, -1), (0, 1))  # 상하좌우
```
---

### 3. for문 문법 기초

#### 변수명 자리 / 이터러블 자리

`for 변수명 in 이터러블:` 구조에서

- **변수명 자리** : 순회할 때 꺼낸 값을 담는 변수, 이름은 자유롭게 지정
- **이터러블 자리** : 순회할 수 있는 것이면 무엇이든 가능

```python
arr = [10, 20, 30]

for elem in arr:    # ✅
for x in arr:       # ✅ 동일한 동작
for val in arr:     # ✅ 동일한 동작
```

#### 이터러블(iterable) 종류

```python
for x in [1, 2, 3]:                   # 리스트
for x in (1, 2, 3):                   # 튜플
for x in "hello":                     # 문자열 → h e l l o
for x in range(5):                    # range 객체
for x in map(int, input().split()):   # map 객체
```

> 💡 `for`문이 값을 하나씩 꺼낼 수 있는 것을 **이터러블(iterable)** 이라고 함

---

### 4. for문 순회 패턴

| 패턴 | 언제 쓰냐 | 인자 개수 |
|---|---|---|
| `for i in range(n)` | 인덱스만 필요 | 1개 |
| `for x in arr` | 값만 필요 | 1개 |
| `for i, x in enumerate(arr)` | 인덱스 + 값 | 2개 |
| `for x, y in zip(a, b)` | 두 리스트 동시 | 2개 |
| `for i, (x, y) in enumerate(zip(a, b))` | 인덱스 + 두 리스트 | 3개 |

```python
# 1. 인덱스만 — range()
for i in range(5):
    print(i)   # 0 1 2 3 4

# 2. 값만 — 직접 순회
arr = [10, 20, 30]
for x in arr:
    print(x)   # 10 20 30

# 3. 인덱스 + 값 — enumerate()
for i, x in enumerate(arr):
    print(i, x)   # 0 10 / 1 20 / 2 30

# 4. 두 리스트 동시 — zip()
a = [1, 2, 3]
b = ["a", "b", "c"]
for x, y in zip(a, b):
    print(x, y)   # 1 a / 2 b / 3 c
```

> ⚠️ `for i, x in arr` 처럼 `enumerate()` 없이 인자 2개 쓰면 TypeError  
> → 인덱스가 필요하면 반드시 `enumerate()` 사용