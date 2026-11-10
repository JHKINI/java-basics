# 03. Spring MVC · MyBatis (Eclipse)

> Eclipse Dynamic Web Project · Spring 3.0.6 · MyBatis · Tomcat 9 · Oracle DB
> 같은 "회원 목록·가입·수정·삭제" 기능을 **설정 방식만 바꿔가며** 다시 만들었습니다. XML 설정 → JDBC → MyBatis → 스프링 연동 → 애너테이션 순서입니다.

| 프로젝트 | 주제 | 실습 내용 |
|---|---|---|
| `pro21_` | Spring MVC 기초 | `DispatcherServlet` + `action-servlet.xml`. `SimpleUrlHandlerMapping`으로 URL과 컨트롤러 연결, `MultiActionController` + `PropertiesMethodNameResolver`로 URL마다 다른 메서드 호출, `InternalResourceViewResolver`로 JSP 찾기 |
| `pro22` | Spring JDBC | `jdbc.properties` + `PropertyPlaceholderConfigurer`, `JdbcTemplate`으로 회원 조회. Controller → Service → DAO 계층과 인터페이스 / 구현 클래스(`MemberServiceImpl` 등) 분리 |
| `pro23` | MyBatis 단독 사용 | `SqlMapConfig.xml` + `SqlSessionFactoryBuilder`. 매퍼 XML에 전체 조회, 아이디·비밀번호로 조회, 추가, 수정, 삭제 작성. 동적 SQL `<where>`, `<choose>`, `<foreach>`(여러 건 조회·추가) |
| `pro24` | Spring + MyBatis 연동 | `SqlSessionFactoryBean`, `SqlSessionTemplate`을 빈으로 등록해서 DAO에 주입. 설정 파일을 `action-mybatis.xml` / `action-service.xml`로 역할별로 나눔 |
| `pro26` | 애너테이션 기반 | `@Controller`, `@Service`, `@Repository`, `@Autowired`, `@RequestMapping`, `@RequestParam`, `@ModelAttribute`와 `<context:component-scan>`. XML에 빈을 일일이 등록하던 방식을 애너테이션으로 바꿈. 로그인 폼 예제 포함 |

## 흐름 정리

```text
pro21_  URL ↔ 컨트롤러 연결을 XML로 직접 작성
  ↓
pro22   DB 연결(JdbcTemplate) + Controller / Service / DAO 계층 분리
  ↓
pro23   SQL을 자바 코드에서 꺼내 MyBatis 매퍼 XML로
  ↓
pro24   MyBatis를 스프링 빈으로 등록해서 주입
  ↓
pro26   빈 등록과 URL 매핑을 애너테이션으로
```

이후 Maven + IntelliJ로 진행한 Spring 프로젝트(Tiles, 파일 업로드, REST, 답변형 게시판)는 [Java_spring_Study](https://github.com/JHKINI/Java_spring_Study) 레포에 있습니다.

## 실행 환경과 라이브러리

`.jar` 파일은 저장소에 올리지 않았습니다. 실행하려면 각 프로젝트의 `src/main/webapp/WEB-INF/lib/`에 아래 파일을 넣어주세요.

- `pro21_`, `pro22`, `pro24`, `pro26` (공통 42개): `org.springframework.*-3.0.6.RELEASE`, `mybatis-3.0.5`, `mybatis-spring-1.0.1`, `ojdbc6`, `commons-dbcp`, `commons-pool`, `commons-logging`, `commons-fileupload`, `commons-io`, `jstl`, `standard`, `tiles-*-2.2.2`, `log4j`, `slf4j`, `aspectj.weaver`, `aopalliance`, `cglib-nodep` 등
- `pro23`: `mybatis-3.4.6`, `ojdbc6`, `jstl`, `standard`
- DB 연결 정보: 각 프로젝트의 `jdbc.properties` (로컬 Oracle `testdb`, 교재 기본 계정)
