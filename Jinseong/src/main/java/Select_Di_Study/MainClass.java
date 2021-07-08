package Select_Di_Study;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:selectDi.xml");
		
		Men men = gen.getBean("Men",Men.class);
		men.myPencil();
	}
}
