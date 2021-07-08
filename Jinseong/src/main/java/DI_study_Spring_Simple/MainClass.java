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
			System.out.println("���� ���� bean ����Ű���ִ�.");
		}else {
			System.out.println("������Ÿ�Լ��� �� Spring�� �ƴϴ�");
		}
	
		if(javaToy == javaToy2) {
			System.out.println("���� ���� ��ü�� ����Ű���ִ�.");
		}else {
			System.out.println("�ڹٴ� �ƴϴ�.");
		}
		
		SpringToy.myBattery();
		SpringToy.UseMens();
	
	}
}
