# [[개념]반복 횟수의 제어](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-dependent-loops)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 다중 반복문 / 반복 횟수의 제어](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 10 XP |

---

### 핵심 개념
외부 반복문의 변수 `i`를 내부 반복문의 범위에 활용해 **행마다 출력 횟수를 동적으로 조절**한다.

---

### 사고 흐름 정리

```
1. 각 행에서 몇 개를 출력해야 하는지 직접 써본다
   i=1 → 1개 / i=2 → 3개 / i=3 → 5개

2. i와 출력 개수의 관계식을 구한다
   개수 = i * 2 - 1

3. 그 식을 내부 range()에 넣는다
   range(i * 2 - 1)  또는  range(1, i * 2)
```
