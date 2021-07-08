package DI_study_Spring_Simple;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:SimpleExContext.xml");
		AirToy airtoy = gen.getBean("airToy",AirToy.class);
		airtoy.useAirMens();
		
		PersonToy pToy = gen.getBean("personToy",PersonToy.class);
		pToy.myBattery();
		pToy.UseMens();
	
	}
}
