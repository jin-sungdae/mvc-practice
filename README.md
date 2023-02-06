# mvc-practice

### Reflection
- 힙 영역에 로드돼 있는 클래스 타입의 객체를 통해 필드/메소드/생성자를 접근 제어자와 상관 없이 사용할 수 있도록 지원하는 API
- 컴파일 시점이 아닌 런타임 시점에 동적으로 특정 클래스의 정보를 추출해낼 수 있는 프로그래밍 기법
- 주로 프레임워크 또는 라이브러리 개발 시 사용 

### 프론트 컨트롤러 패턴
- 모든 요청을 단일 handler(처리기)에서 처리하도록 하는 패턴
- 스프링 웹 mvc 프레임워크의 DispatcherServlet(프론트 컨트롤러 역할)이 프런트 컨트롤러 패턴으로 구현돼 있음

### Forward
- 서블릿에서 클라이언트(웹 브라우저)를 거치지 않고 바로 다른 서블릿(또는 JSP)에게 요청하는 방식
- Forward 방식은 서버 내부에서 일어나는 요청이기 때문에 HttpServletRequest, HttpServletResponse객체가 새롭게 생성되지 않음(공유됨)
- RequestDispatcher dispatcher = request.getRequestDispatcher("포워드 할 서블릿 또는 JSP")
- dispatcher.forward(request, response)

### Redirect
- 서블릿이 클라이언트(웹 브라우저)를 다시 거쳐 다른 서블릿(또는 JSP)에게 요청하는 방식
- Redirect 방식은 클라이언트로부터 새로운 요청이기 때문에 새로운 HttpServletRequest, HttpServletResponse 객체가 생성됨
- HttpServeletResponse객체의 sendRedirect()

### 프런트 컨트롤러 패턴
- 모든 요청을 단일 handler(처리기)에서 처리하도록 하는 패턴
- 스프링 웹 MVC 프레임워크의 DispatcherServlet(프론터 컨트롤러 역할)이 프런트 컨트롤러 패턴으로 구현돼 있음

### DI(Dependency Injection)
- 의존성 주입
  - 한 객체가 다른 객체를 사용할 때 의존성이 있다고 함
- 런타임 시 의존 관계를 맺는 대상을 외부에서 결정하고 주입해 주는 것
- 스프링 프레임워크는 DI 기능을 지원해 주는 프레임워크
- 장점
  - 의존성 주입을 인터페이스 기반으로 설계하면, 코드가 유연해짐
    - 느슨한 결합도(loose coupling)
  - 변경이 유연해짐
    - 결합도가 낮은 객체끼리 부품을 쉽게 갈아끼울 수 있음