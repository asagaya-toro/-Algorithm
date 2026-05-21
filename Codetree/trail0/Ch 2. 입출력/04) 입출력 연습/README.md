# [[개념]입출력 연습](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-input-output-practice)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 입출력 / 입출력 연습](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 우선순위 규칙

연산할 때 **더 정밀한 타입(우선순위 높은 쪽)으로 자동 변환**된다.

```
bool → int → float → complex
         낮음                  높음
```

```python
True + 1      # bool + int → int : 2
3 + 1.5       # int + float → float : 4.5
1 + 2j        # int + complex → complex : (1+2j)
```

---

### 연산자가 타입을 강제하는 경우

🔴 변수를 `int`로 선언해도, **연산자 자체가 결과 타입을 결정**하는 경우가 있다.

| 연산자 | 결과 타입 | 비고 |
|---|---|---|
| `/` | 항상 `float` | `int / int`도 float |
| `//` | 항상 `int` | 내림(floor) |
| `%` | 피연산자 따라감 | `int % int` = int |
| `**` | 지수가 음수면 `float` | `2 ** -1` = 0.5 |

```python
6 / 3      # → 2.0  (딱 나눠져도 float!)
6 // 3     # → 2    (int)
2 ** -1    # → 0.5  (float)
```
---

### 정수로 쓰고 싶을 때

```python
avg = hub // 3         # 처음부터 int로 — 가장 깔끔
avg = int(hub / 3)     # 계산 후 변환 (소수점 버림)
avg = round(hub / 3)   # 반올림 (결과는 float)
```