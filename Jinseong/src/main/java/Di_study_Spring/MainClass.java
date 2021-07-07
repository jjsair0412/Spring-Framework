package Di_study_Spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:Application_context.xml");
		
		ElctToy elctToy = gen.getBean("ElctToy",ElctToy.class);
		
		ElcCarToy elcCar = gen.getBean("ElcCarToy",ElcCarToy.class);
		
		ElcAirToy elcAirToy = gen.getBean("ElcAirToy",ElcAirToy.class);
		
	}

}
