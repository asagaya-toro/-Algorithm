# [[개념]문자열](https://www.codetree.ai/trails/complete/curated-cards/nl-pre-string)

| 항목 | 내용 |
|---|---|
| 분류 | Trail |
| 커리큘럼 | [Trail 0 / 문자열 / 문자열](https://www.codetree.ai/trail-info/codetree-101/) |
| 난이도 | 쉬움 |
| 경험치 | 0 XP |

---

## 1. 문자열이란?

문자(Character)들의 **순서 있는 집합**으로, 파이썬에서는 `str` 타입으로 표현.  
파이썬에는 별도의 `char` 타입이 없고, 문자 하나도 길이 1짜리 문자열.

```python
type("hello")  # <class 'str'>
type("h")      # <class 'str'>  ← char 없음
```

---

## 2. 문자열의 특징

| 특징 | 설명 |
|------|------|
| **불변(Immutable)** | 한 번 만들면 내부 값을 바꿀 수 없음 |
| **순서 있음(Ordered)** | 인덱스로 각 문자에 접근 가능 |
| **반복 가능(Iterable)** | `for` 문으로 문자 하나씩 순회 가능 |

---

## 3. 문자열 생성 / 초기화

```python
s1 = "hello"        # 큰따옴표
s2 = 'hello'        # 작은따옴표 (동일)
s3 = str(123)       # 숫자 → 문자열 변환 "123"
s4 = ""             # 빈 문자열
s5 = str()          # 빈 문자열
```

---

## 4. `"""` `'''` 삼중 따옴표란?

여러 줄 문자열을 만들 때 사용.  
줄바꿈을 `\n` 없이 그대로 표현.

```python
s = """첫 번째 줄
두 번째 줄
세 번째 줄"""

s = '''이것도
똑같이
여러 줄'''
```

주로 **함수/클래스 설명(docstring)** 에도 사용.

```python
def greet():
    """이 함수는 인사를 출력합니다."""
    print("hello")
```

---

## 5. 인덱싱 & 값 변경 불가

```python
s = "hello"

s[0]   # 'h'   ← 읽기 가능
s[-1]  # 'o'   ← 음수 인덱스도 가능

s[0] = 'H'  # ❌ TypeError: 'str' object does not support item assignment
```

불변이기 때문에 인덱스로 직접 변경이 **불가능**.  
변경하려면 새 문자열을 만들어야 함.

```python
# 방법 1. 슬라이싱
s = "H" + s[1:]          # "Hello"

# 방법 2. 리스트 변환 후 join
lst = list(s)
lst[0] = 'H'
s = "".join(lst)          # "Hello"
```

---

## 6. 문자열 수정 / 덧셈 / 곱셈

```python
s = "hello"

# 덧셈 (연결)
s2 = s + " world"     # "hello world"

# 곱셈 (반복)
s3 = s * 3            # "hellohellohello"

# 덧셈 할당
s += "!"              # "hello!"  ← 기존 객체 수정이 아닌 새 객체 생성
```

> `+=` 도 내부적으로는 새 문자열을 만들어 재할당하는 것입니다.

---

## 7. 슬라이싱

### 언제 사용?
- 문자열의 **일부분을 추출**할 때
- 특정 위치의 문자를 **교체**할 때 (불변 우회)
- 문자열을 **뒤집을** 때

### 사용법

```python
s = "hello"
#    01234  (양수 인덱스)
#   -5-4-3-2-1  (음수 인덱스)

s[1:3]    # "el"   ← 1번 이상 3번 미만
s[:3]     # "hel"  ← 처음부터 3번 미만
s[2:]     # "llo"  ← 2번부터 끝까지
s[:]      # "hello" ← 전체 복사
s[::2]    # "hlo"  ← 2칸씩 건너뜀 (step)
s[::-1]   # "olleh" ← 문자열 뒤집기
```

### 특정 위치 교체 예시

```python
s = "hello"

# 1번 인덱스를 'a'로 교체
s = s[:1] + 'a' + s[2:]      # "hallo"

# 뒤에서 두 번째를 'a'로 교체
s = s[:-2] + 'a' + s[-1:]    # "halao"
```

---

## 8. 주요 메소드 정리

### 대소문자

```python
s = "Hello World"

s.upper()       # "HELLO WORLD"
s.lower()       # "hello world"
s.capitalize()  # "Hello world"  ← 첫 글자만 대문자
s.title()       # "Hello World"  ← 각 단어 첫 글자 대문자
```

### 공백 / 문자 제거

```python
s = "  hello  "

s.strip()       # "hello"   ← 양쪽 공백 제거
s.lstrip()      # "hello  " ← 왼쪽만
s.rstrip()      # "  hello" ← 오른쪽만
s.strip("h")    # 특정 문자 제거도 가능
```

### 검색 / 확인

```python
s = "hello world"

s.find("world")      # 6     ← 없으면 -1
s.index("world")     # 6     ← 없으면 ValueError
s.count("l")         # 3     ← 등장 횟수
s.startswith("he")   # True
s.endswith("ld")     # True
"ell" in s           # True  ← 포함 여부
```

### 변환

```python
s = "hello world"

s.replace("world", "python")   # "hello python"
s.split(" ")                   # ["hello", "world"]
s.split()                      # 공백/탭/줄바꿈 모두 기준으로 분리
" ".join(["hello", "world"])   # "hello world"
```

### 정렬 / 채우기

```python
s = "hi"

s.center(10)        # "    hi    "
s.ljust(10)         # "hi        "
s.rjust(10)         # "        hi"
s.zfill(5)          # "000hi"  ← 앞을 0으로 채움
```

### 판별

```python
"123".isdigit()    # True  ← 숫자로만 구성
"abc".isalpha()    # True  ← 알파벳으로만 구성
"abc123".isalnum() # True  ← 알파벳+숫자
"   ".isspace()    # True  ← 공백으로만 구성
```

---

## 9. 이스케이프 문자

| 이스케이프 | 의미 |
|-----------|------|
| `\n` | 줄바꿈 |
| `\t` | 탭 |
| `\\` | 백슬래시 `\` |
| `\'` | 작은따옴표 `'` |
| `\"` | 큰따옴표 `"` |
| `\r` | 캐리지 리턴 |
| `\0` | 널 문자 |

```python
print("hello\nworld")   # 줄바꿈
print("tab\there")      # 탭 간격
print("he said \"hi\"") # 따옴표 포함
```

### raw string — 이스케이프 무시

```python
print(r"hello\nworld")  # "hello\nworld" 그대로 출력
# 정규식, 파일 경로 등에 자주 사용
```
