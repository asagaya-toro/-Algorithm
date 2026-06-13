# [[개념]무한 루프](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-infinite-loop)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 단순 반복문 2 / 무한 루프](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 10 XP |

---

### while 이란?

조건식이 `True`인 동안 반복 실행. 조건이 `False`가 되는 순간 종료.

```python
while 조건식:
    실행할 코드
```

### 기본 예시

```python
count = 0
while count < 3:
    print(count)
    count += 1
# 출력: 0, 1, 2
```

---

### 무한루프 — `while True`

종료 조건 없이 계속 반복 실행되는 루프. `break`로 원하는 시점에 탈출.

```python
while True:
    user_input = input("명령어 입력 (quit 종료): ")
    if user_input == "quit":
        break          # 루프 강제 탈출
    print(f"입력값: {user_input}")
```

> 💡 `break` = 루프 즉시 종료 / `continue` = 현재 반복만 건너뜀

---

## while vs for — 차이점

|  | `while` | `for` |
|--|---------|-------|
| 반복 기준 | 조건식 (참/거짓) | 순회 가능한 객체 (리스트, range 등) |
| 반복 횟수 | 불확정 (조건에 따라) | 확정적 (요소 개수만큼) |
| 무한루프 | `while True:` 로 간단히 구현 | 일반적으로 사용 안 함 |
| 주요 상황 | 종료 시점을 모를 때 | 반복 횟수/범위가 정해졌을 때 |

---

### 무한루프를 왜 사용할까?

| 상황 | 예시 |
|------|------|
| 사용자 입력 대기 | CLI 앱, 챗봇 — quit 입력 전까지 계속 받기 |
| 게임 루프 | 게임 오버 전까지 화면 업데이트 반복 |
| 서버 / 데몬 | 웹서버가 요청 계속 대기 |
| 백준 / 알고리즘 | 여러 테스트케이스를 EOF까지 반복 입력 |

---
