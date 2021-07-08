package DI_study_Spring_Simple;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:SimpleExContext.xml");
		AirToy airtoy = gen.getBean("airToy",AirToy.class);
		airtoy.useAirMens();
		
		PersonToy SpringToy = gen.getBean("personToy",PersonToy.class);
		PersonToy Spring2Toy = gen.getBean("personToy",PersonToy.class);
		
		PersonToy javaToy = new PersonToy(new Battery());
		PersonToy javaToy2 = new PersonToy(new Battery());
		
		if(SpringToy == Spring2Toy) {
			System.out.println("둘은 같은 bean 가르키고있다.");
		}else {
			System.out.println("프로토타입설정 후 Spring도 아니다");
		}
	
		if(javaToy == javaToy2) {
			System.out.println("둘은 같은 객체를 가르키고있다.");
		}else {
			System.out.println("자바는 아니다.");
		}
		
		SpringToy.myBattery();
		SpringToy.UseMens();
	
	}
}
