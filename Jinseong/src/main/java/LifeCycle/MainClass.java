package LifeCycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:LifeCycle.xml");
		
		UseMethodClass methodClass = gen.getBean("UseMethodClass",UseMethodClass.class);
		UseInterfaceClass interfaceClass = gen.getBean("UseInterfaceClass",UseInterfaceClass.class);
		SubClass subClass = gen.getBean("SubClass",SubClass.class);
		
		System.out.println();
		
		subClass.getMethodClassSubClass();
		subClass.getInterfaceClassSubClass();
		
		System.out.println();
		
		gen.close();
	}
}
