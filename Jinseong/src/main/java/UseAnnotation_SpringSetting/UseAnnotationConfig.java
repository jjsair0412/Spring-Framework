package UseAnnotation_SpringSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration 어노테이션을 사용한다면,
// xml을 사용한것과 동일하게 스프링 컨테이너로 사용할 수 있다.
@Configuration
public class UseAnnotationConfig {
	
	PersonToy personToy = new PersonToy(new Battery());
	AirToy airToy= new AirToy(new Battery());
	// 사용할때마다 생성자에 객체를 주입시키는상황이기 때문에, 미리 주입시켜놓고 사용하겠다
	
	// 해당 class파일이 xml파일을 대신해서 스프링 컨테이너를 생성할수 있어야 한다.
	
	// xml에선 bean 객체를 생성할 때,
	// <bean id = "battery" class ="DI_study_Spring_Simple.Battery"/>
	// 이렇게 사용했다.
	
	// Java에선 bean을 생성할때 메서드를 이용한다.
	// 반환형은 만들고자 하는 객체의 데이터타입을 작성한다.
	// 여기선 UseInterfaceClass를 작성한다.
	// 그 후, id를 작성한다.
	// 마지막으로 new 키워드로 생성해준것을 반환해주고, 위에 @Bean 어노테이션을 추가해주면 된다.
	@Bean
	public Battery battery() {
		return new Battery();
	}
	
	// 만약 생성자에 객체를 주입시켜야 한다면, new 키워드로 생성할 때 파라미터값으로 넣어주면 된다.
	@Bean
	public PersonToy personToy() {
		
//		return new PersonToy(new Battery());
		return personToy;
	}
	
	@Bean
	public AirToy airToy() {
//		return new AirToy(new Battery());
		return airToy;
	}
	
	// 만약 어떤 클래스에 메서드안에 파라미터값을 넣어주어야 한다면, 하단처럼 작성한다.
	// 기존 자바와 같게 레퍼런스를 생성한뒤, 참조연산자를 통해 파리미터를 넣어준다.
	// 마지막으로 반환시켜준다.
	// 해당 예제에서는 파라미터 데이터타입이 String이다.
	@Bean
	public PersonToy personToyBatteryset() {
		personToy.setBatteryResult("충전완료했어요");
		return personToy;
	}
	
			
}
