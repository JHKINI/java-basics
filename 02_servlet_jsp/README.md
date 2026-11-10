# 02. Servlet · JSP

> Eclipse Dynamic Web Project · Apache Tomcat 9 · Oracle DB
> 프로젝트 이름(`pro05` ~ `pro17`)은 교재 장 번호를 따랐습니다.

요청 → 응답 기본 흐름부터 시작해서 DB 연동, 페이지 이동, 세션, 필터를 거쳐 **MVC 패턴으로 회원 관리·게시판**까지 만들었습니다.

| 프로젝트 | 주제 | 실습 내용 |
|---|---|---|
| `pro05` | 서블릿 시작 | `HttpServlet` 상속, `init()` / `doGet()` / `destroy()` 생명주기 확인. `web.xml` 매핑(`/first`, `/second`)과 `@WebServlet` 애너테이션 매핑(`/third`) 비교 |
| `pro06` | 요청과 응답 | `getParameter()`, `getParameterValues()`로 폼 값 받기, `doGet` vs `doPost`, 한글 처리(`setContentType`). 로그인 폼, 계산기(`/Calc`), 구구단(`/GuguTest`) |
| `pro07` | DB 연동 | 회원 조회·추가·삭제. `DriverManager`로 직접 연결 → **커넥션 풀(`DataSource`, JNDI)**로 바꿔 보기. `PreparedStatement`, DAO / VO 패턴 |
| `pro08` | 페이지 이동과 바인딩 | `sendRedirect`, `Refresh` 헤더, `RequestDispatcher.forward`를 각각 비교. `setAttribute()`로 다음 서블릿에 데이터 넘기기 |
| `pro09` | 쿠키와 세션 | 쿠키 저장·읽기(`setMaxAge`), `HttpSession` 생성과 `isNew()`, 세션으로 로그인 상태 유지 |
| `pro10` | 컨텍스트 · 필터 · 리스너 | `ServletContext`로 애플리케이션 전체에 값 공유, URL 패턴 매핑(`/first/*`, `*.do`), **한글 인코딩 필터(`@WebFilter("/*")`)**, `HttpSessionBindingListener` / `HttpSessionListener`로 로그인 사용자 수 세기 |
| `pro14` | 표현 언어 · JSTL | `<jsp:useBean>`, EL(`${param.id}` 등), JSTL `<c:forEach>`, `<c:if>`, forward / redirect를 JSP에서 다루기 |
| `pro17` | **MVC 패턴** | 컨트롤러 서블릿 하나가 `*.do` 요청을 받아 `getPathInfo()`로 나눠 처리. 회원 목록·가입·수정·삭제(`/member/*`) → 게시판 글 목록(`/board/*`, Controller → Service → DAO) |

## 실행 환경과 라이브러리

라이브러리 `.jar` 파일은 용량 때문에 저장소에 올리지 않았습니다. 실행하려면 각 프로젝트의 `src/main/webapp/WEB-INF/lib/`에 아래 파일을 넣어주세요.

| 프로젝트 | 필요한 라이브러리 |
|---|---|
| `pro07`, `pro09` | `ojdbc11.jar`, `tomcat-dbcp.jar` |
| `pro14` | `taglibs-standard-*-1.2.5.jar` (compat, impl, jstlel, spec) |
| `pro17` | 위의 Oracle + JSTL 파일 모두 |

- DB 연결 정보(커넥션 풀)는 [`../Servers`](../Servers)의 `context.xml`에 있습니다. 로컬 Oracle `testdb`, 교재 기본 계정을 사용했습니다.
- Eclipse에서 **File → Import → Existing Projects into Workspace**로 프로젝트 폴더를 열고, Tomcat 9 서버에 추가해서 실행합니다.
