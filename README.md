# ☕ java-basics

한국폴리텍대학 **AI소프트웨어과 하이테크과정** Java 수업(화요일)에서 **Eclipse로 실습한 코드**를 정리한 저장소입니다.
자바 문법에서 시작해서 서블릿·JSP로 웹의 기본 흐름을 익히고, 같은 회원 관리 기능을 Spring과 MyBatis로 다시 만드는 단계까지 담았습니다.

| 항목 | 내용 |
|---|---|
| 기간 | 2026년 3월 ~ |
| 도구 | Eclipse · JDK · Apache Tomcat 9 · Oracle DB |
| 분량 | Java 213개 · JSP 59개 · HTML 17개 |
| 이어지는 저장소 | Maven + IntelliJ로 진행한 Spring 프로젝트: [Java_spring_Study](https://github.com/JHKINI/Java_spring_Study) |

---

## 🗺 학습 로드맵

| 단계 | 폴더 | 배운 것 |
|---|---|---|
| 1 | [01_java_basics](01_java_basics) | 변수·연산자·조건문 → 반복문·배열·**예외 처리** → 클래스·생성자 → **상속·추상 클래스·인터페이스** → String·Wrapper·**컬렉션·제네릭**·파일 입출력 |
| 2 | [02_servlet_jsp](02_servlet_jsp) | 서블릿 생명주기 → 요청 파라미터 → **DB 연동(DAO, 커넥션 풀)** → forward / redirect → 쿠키·세션 → 필터·리스너 → EL·JSTL → **MVC 패턴으로 회원 관리·게시판** |
| 3 | [03_spring_mybatis](03_spring_mybatis) | Spring MVC(XML 설정) → `JdbcTemplate` → MyBatis 매퍼·동적 SQL → Spring + MyBatis 연동 → **애너테이션 기반**(`@Controller`, `@Autowired`) |

📝 **손필기 정리**: [`notes/java.md`](notes/java.md) (배열은 객체다, 참조 변수와 주소, 정적·동적 메모리, for-each와 enum, 2차원 배열)

---

## 🔍 이렇게 공부했습니다

### 같은 기능을 방식만 바꿔 여러 번 만들기
"회원 목록·가입·수정·삭제"를 단계마다 다시 만들었습니다.

```text
서블릿 + JDBC (pro07)
 → 커넥션 풀 + DAO/VO (pro07)
 → MVC 컨트롤러 하나로 요청 분기 (pro17)
 → Spring XML 설정 + JdbcTemplate (pro22)
 → MyBatis 매퍼 (pro23)
 → Spring + MyBatis (pro24)
 → 애너테이션 (pro26)
```

같은 기능이라서 **무엇이 바뀌었는지**(SQL 위치, 객체 생성 방법, URL 연결 방법)를 비교하기 쉬웠습니다.

### 비교하며 익히기
- `sendRedirect` / `Refresh` / `forward`를 각각 따로 만들어서 URL과 데이터 전달 방식의 차이를 확인 (`pro08`)
- 0으로 나누기, 배열 범위 초과, 잘못된 입력 형식, 숫자 변환 실패를 각각 일부러 발생시켜 보고 `try-catch`로 처리 (`Test3_14` ~ `Test3_18`)

### 필기로 개념 정리
"배열 변수에는 값이 아니라 **주소**가 들어 있다", "자바는 메모리에 직접 접근하지 않고 **참조**로 접근한다"처럼 헷갈렸던 부분을 그림과 함께 정리했습니다. ([필기 정리](notes/java.md))

---

## 📂 폴더 구조

```text
java-basics/
├── 01_java_basics/        Eclipse Java 프로젝트 (java_test, java_test_2, study_package)
├── 02_servlet_jsp/        pro05 ~ pro17 (Dynamic Web Project)
├── 03_spring_mybatis/     pro21_, pro22, pro23, pro24, pro26
├── Servers/               Tomcat 9 서버 설정 (DB 커넥션 풀 context.xml)
└── notes/                 Java 손필기 정리 + 사진
```

## ▶️ 실행

1. Eclipse에서 **File → Import → General → Existing Projects into Workspace**로 원하는 프로젝트 폴더 선택
2. Java 기초(`01_java_basics`): 파일을 열고 **Run As → Java Application**
3. 웹 프로젝트: 각 폴더 README에 적힌 라이브러리를 `WEB-INF/lib`에 넣고 Tomcat 9 서버에 추가해서 실행
   - `.jar` 파일과 빌드 결과물은 용량 때문에 올리지 않았습니다.
