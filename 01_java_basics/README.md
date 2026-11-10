# 01. Java 기초 문법

> 화요일 Java 수업 · Eclipse · `java_test` 프로젝트 (Eclipse에서 **File → Import → Existing Projects into Workspace**로 이 폴더를 그대로 열 수 있습니다)

패키지 3개에 배운 순서대로 정리되어 있습니다.

| 패키지 | 다룬 내용 |
|---|---|
| `java_test` | 기본 문법(2장), 반복문·배열·예외 처리(3장), 클래스와 생성자 |
| `java_test_2` | 객체 배열, 배열 전달, `static`, 상속과 `super`, 추상 클래스, 인터페이스, `instanceof` |
| `study_package` | `Object` 메서드(`equals`, `toString`), Wrapper·박싱, `String`·`StringBuffer`, 컬렉션, 제네릭, 파일 입출력 |

---

## `java_test`: 문법 기초

### 2장. 변수 · 연산자 · 조건문

| 파일 | 내용 |
|---|---|
| `Test2_1_Hello` | 첫 프로그램, 메서드 호출 |
| `Test2_2_CircleArea` | `final` 상수로 원 넓이 계산 |
| `Test2_3_TypeConversion` | 자동 형변환과 정수 나눗셈 |
| `Test2_4_ScannerEx`, `ScannerTest` | `Scanner`로 여러 자료형 입력받기 |
| `Test2_5` ~ `Test2_7`, `Test_2_8`, `Test_2_9` | 산술·대입·비교·논리·비트 연산자 |
| `Test2_10` ~ `Test2_13` | `if`, `if-else`, 다중 `if` (합격 판정, 3의 배수, 학점) |
| `Test2_14`, `Test2_15` | `switch` (점수 → 학점, 커피 주문) |

**실습 문제 풀이**

| 파일 | 문제 |
|---|---|
| `Test_l2` | 금액을 입력받아 5만 원권·1만 원권… 몇 장인지 계산 |
| `Test_l3` | 정수 3개로 삼각형을 만들 수 있는지 판별 |
| `Test_l4` | 점이 사각형 (100,100)~(200,200) 안에 있는지 판별 |
| `Test_l5_2` | 점이 원 안에 있는지 판별 |
| `Test_l6` | 달(1~12)을 입력받아 계절 출력 (`switch`) |
| `Test_last` | 원화를 달러로 환산 |

### 3장. 반복문 · 배열 · 예외 처리

| 파일 | 내용 |
|---|---|
| `Test3_1` ~ `Test3_3` | `for`, `while`, `do-while` |
| `Test3_4_NestedLoop` | 중첩 반복 (구구단) |
| `Test3_5`, `Test3_6` | `continue`, `break` (`exit` 입력 시 종료) |
| `Test3_7` ~ `Test3_9` | 배열 생성·접근, `length`, for-each와 `enum` |
| `Test3_10_ScoreAverage` | 2차원 배열로 학년별 평점 평균 |
| `Test3_11_*` | 비정방형(래기드) 배열, 2차원 배열 패턴 출력 |
| `Test3_12_ReturnArray` | 배열을 리턴하는 메서드 |
| `Test3_13_Calc` | `main(String[] args)`로 받은 인자 합계 |
| `Test3_14`, `Test3_15` | 0으로 나누면 프로그램이 멈추는 것 확인(3_14) → `try-catch`로 `ArithmeticException` 처리(3_15) |
| `Test3_16` | 배열 범위 초과 → `ArrayIndexOutOfBoundsException` |
| `Test3_17` | 정수 대신 문자 입력 → `InputMismatchException` |
| `Test3_18` | `"3.141592"`를 정수로 변환 → `NumberFormatException` |
| `TEST`, `TEST_2`, `TEST_3`, `task3` | 별 찍기 패턴 연습 (삼각형, 피라미드 테두리 등) |

### 4장. 클래스와 객체

| 파일 | 내용 |
|---|---|
| `Circle`, `Circle_1` | 필드와 메서드, 매개변수 없는 생성자 |
| `Rectangle` | 생성자를 안 만들면 기본 생성자가 자동으로 생김 |
| `Book`, `Book_2` | 생성자 오버로딩, `this()`로 다른 생성자 호출 |

---

## `java_test_2`: 객체지향

| 파일 | 내용 |
|---|---|
| `CircleArray`, `BookArray` | 객체 배열 |
| `ArrayParameterEx` | 배열을 메서드에 넘겨서 원본 수정 (공백 → 쉼표) |
| `CalcEx`, `StaticMember` | `static` 메서드·필드 (환율 변환기) |
| `SuperEX` | 상속과 `super()`로 부모 생성자 호출 (Point → ColorPoint) |
| `Calc` | 추상 클래스 `Calculator`를 상속해서 추상 메서드 구현 |
| `InterfaceEx` | 인터페이스 구현, `default` 메서드 |
| `Interface5_9` | 인터페이스 상속 + 클래스 상속을 함께 쓰는 SmartPhone 예제 |
| `InstanceOfEx` | `instanceof`로 객체 타입 확인 |

## `study_package`: 자바 기본 API

| 분류 | 파일 |
|---|---|
| Object 클래스 | `ObjectPropertyEx`, `ToStringEx`, `EqualsEx`, `Equals_EX` |
| 오버라이딩 | `MethodOverridingEx` (Shape → Line, Rect, Circle) |
| Wrapper · 박싱 | `WrapperEx`, `AutoBoxingUnBoxingEx` |
| 문자열 | `StringEx`, `StringBufferEx`, `StringToKeniserEx` (StringTokenizer) |
| 유틸 | `MathEX` (로또 번호 생성), `CalendarEx` |
| 컬렉션 | `VectorEx`, `PointVectorEx`, `ArrayListEX`, `IteratorEx`, `HashMapDixEx` (영어 사전), `HashMapScoreEx`, `HashMapStudentEx`, `CollectionsEx` (정렬·이진 탐색) |
| 제네릭 | `MyStack`, `GenericMethodExample` (`GStack<T>` 직접 구현) |
| 파일 입출력 | `FileReaderEx`, `FileReadHangulSuccess` (한글 인코딩 지정), `FileInputStreamEx`, `FileOutputStreamEx`, `BufferedIOEx`, `BinaryCopyEx`, `FileEx` |
| 직접 구현 시도 | `MyStringEX`: `String`의 `concat`, `trim`, `replace` 등을 직접 만들어 보려던 미완성 코드 |

---

## 참고

- 수정한 오타 4곳 (컴파일 오류 해결)
  - `VectorEx`: `Vector<integer>` → `Vector<Integer>`, `sise()` → `size()`
  - `CircleArray`, `SuperEX`: 자동 완성으로 잘못 들어간 `import study_package.Circle/Point` 삭제 (같은 파일 안의 클래스를 써야 함)
  - `MathEX`: 선언되지 않은 변수 `a` 추가, 남는 `}` 2개 삭제
- 아직 컴파일되지 않는 파일
  - `MyStringEX`: 직접 구현 중인 미완성 코드
  - `Interface5_9`: 파일 이름과 `public` 클래스 이름이 다름
- `Point`, `GStack`처럼 같은 이름의 보조 클래스가 같은 패키지의 여러 파일에 있어요. 그래서 패키지 전체를 한 번에 컴파일하면 이름이 겹치고, 파일을 하나씩 열어서 실행했습니다.
- 파일 입출력 예제는 `c:\Temp\...` 경로의 파일을 읽습니다.
