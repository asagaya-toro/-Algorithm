# [[개념]반복문에서의 변수 사용](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-loop-variables)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 2 / 반복문에서의 변수 사용](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 10 XP |

---
### 🔁 반복문 안에서 cnt, total 변수 사용

| 변수 | 용도 | 초기값 |
|------|------|--------|
| `cnt` | 조건을 만족하는 **횟수** 세기 | `0` |
| `total` | 값을 **누적 합산**하기 | `0` |

> 💡 두 변수 모두 반복문 **시작 전** 선언하고, 반복문 **안에서** 갱신한다.

---

## 기본 구조

```python
cnt = 0
total = 0

for i in range(...):
    total += i       # 누적 합
    if 조건:
        cnt += 1     # 조건 만족 횟수
```