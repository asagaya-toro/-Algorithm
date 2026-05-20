# [[개념]입력 입문](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-input-basics)


| 항목     | 내용                                                                             |
| -------- | -------------------------------------------------------------------------------- |
| 분류     | Trail                                                                            |
| 커리큘럼 | [Trail 0 / 입출력 / 입력 입문](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도   | 쉬움                                                                             |
| 경험치   | 0 XP                                                                             |

---

### input()이란?

프로그램 실행 중 사용자로부터 값을 받는 것.`input()`을 만나면 잠깐 멈추고 키보드 입력을 기다리며, 엔터를 누르면 다음 줄로 넘어간다.

> **🔴 입력값을 무조건 문자열(str)로 반환한다.**

#### 기본 사용법

```python
input()           # 그냥 입력
input("메시지: ") # 안내 메시지와 함께 입력
n = int(input())  # 변수에 저장
```

---
### 형변환

`input()`은 항상 문자열로 반환하므로 숫자 연산 시 변환 필수.

```python
n = int(input())    # 정수
f = float(input())  # 실수
```

---

### 형변환 관련 에러


| 에러         | 원인                  | 예시         |
| ------------ | --------------------- | ------------ |
| `TypeError`  | 타입이 달라 연산 불가 | `"3" + 1`    |
| `ValueError` | 변환 불가능한 값      | `int("abc")` |

---

### f-string과 함께 사용

```python
N = float(input())
print(f"{N:.2f}")  # 소수점 둘째 자리까지 출력
```
