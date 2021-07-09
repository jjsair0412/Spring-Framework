package UseAnnotation_SpringSetting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class MainClass {
	public static void main(String[] args) {

		// 기존에 방법은, xml을 이용해 스프링 컨테이너를 만들고 만들어진 컨테이너 내부의 bean을
		// getBean하는 방식으로 사용했다.
		
		
		// xml을 사용하는 경우 하단처럼 GenericXmlApplicationContext를 사용했다.
//		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:SimpleExContext.xml");
		// java를 사용할땐 AnnotationConfigApplicationContext를 사용하면 된다.
		// 파라미터값으로는, 사용할 에정인 class를 명시해주면 된다.
		// java 컨테이너를 두가지로 나누었기 때문에,배열 형식으로 나누어서 그냥 써주면 된다.
		// 나누어서 사용하지 않더라도, 하나의 컨테이너.java 파일에서 import해서 사용할 수도 있다.
		// import한 파일을 파라미터값으로 넣어준다. import는 @Configuration하단에 작성하고, 옆에 중괄호로 묶어주면 된다.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UseAnnotationConfig.class, UseAnnotationConfig2.class);
		
		// 그후, 해당 컨테이너의 getBean하는것은 동일하게 해서 메서드를 꺼내다 쓰면 된다.
		// id값으로 메서드를 정의해줫었는데, 메서드에서 괄호를 빼고 getBean에 id값을 넣어주면 된다.
		PersonToy per = ctx.getBean("personToy",PersonToy.class);
		per.UseMens();
		
		AirToy airToy = ctx.getBean("airToy",AirToy.class);
		airToy.useAirMens();
	}
	
}
