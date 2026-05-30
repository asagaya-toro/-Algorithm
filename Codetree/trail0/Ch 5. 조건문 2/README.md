# [[개념]논리 연산자를 이용한 조건문 퀴즈](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-compound-conditions)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 조건문 2 / 논리 연산자를 이용한 조건문](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

### 파이썬 논리 연산자 종류 

| 연산자 | 의미 | 참이 되는 조건 |
|---|---|---|
| `and` | 그리고 | 둘 다 참 |
| `or` | 또는 | 하나만 참이어도 |
| `not` | 부정 | 조건이 거짓일 때 |

---

### 한국어로 판단하는 팁

| 문장 패턴 | 연산자 |
|---|---|
| "A **이고** B이면" | `and` |
| "A **이면서** B이면" | `and` |
| "A **이거나** B이면" | `or` |
| "A **또는** B이면" | `or` |

---

### 자주 하는 실수

> ⚠️ `or 2`처럼 쓰면 2는 단독으로 평가되어 항상 `True`

```python
# ❌ 이렇게 쓰면 안 됨
if x == 1 or 2:

# ✅ 이렇게 써야 함
if x == 1 or x == 2:
```
