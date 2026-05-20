# [[개념]입력](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-input)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 입출력 / 입력](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 여러 줄 입력받기

여러 줄을 입력받을 때는 `input()`을 여러 번 호출한다.

```python
a = input()  # 첫 번째 줄
b = input()  # 두 번째 줄
c = input()  # 세 번째 줄
```

줄 수가 많거나 미리 모를 때는 반복문을 사용한다.

```python
n = int(input())       # 몇 줄 입력받을지
lines = []
for _ in range(n):
    lines.append(input())
```

---

### 한 줄에 여러 값 입력받기 — `split()`

`split()`은 문자열을 **공백(스페이스, 탭)** 기준으로 나눠 리스트로 반환한다.

```python
values = input().split()        # ["1", "2", "3"]
values = input().split(",")     # 쉼표 기준으로 나누기
```

> **🔴 `split()`의 기본 구분자는 공백이지, 줄바꿈(`\n`)이 아니다.**  
> `input()`은 엔터를 치면 그 줄 하나만 읽어온다. 
> 줄바꿈으로 나누려면 `sys.stdin.read().split('\n')` 

---

### 한 번에 여러 변수 선언 — 언패킹

`split()`으로 나눈 리스트를 변수에 한꺼번에 담을 수 있다.

```python
a, b = input().split()       # "1 2" → a = "1", b = "2"
```

> **🔴 split() 결과 개수와 변수 개수가 다르면 `ValueError` 발생.**

---

### `map()` — 형변환을 한꺼번에

`split()`으로 나눈 값들에 `int()`나 `float()`을 일일이 적용하지 않아도 된다.

```python
map(자료형, iterable)
```

```python
a, b = map(int, input().split())       # 정수 두 개
nums = list(map(int, input().split())) # 정수 리스트
```

`map()`은 바로 리스트가 아니라 **map 객체**를 반환한다. 언패킹하거나 `list()`로 감싸서 써야 한다.

```python
result = map(int, "1 2 3".split())
print(result)         # <map object at 0x...>  ← 이걸 그대로 쓰면 안 됨
print(list(result))   # [1, 2, 3]
```