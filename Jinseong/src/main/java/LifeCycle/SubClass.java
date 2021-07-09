package LifeCycle;

import org.springframework.beans.factory.annotation.Autowired;

public class SubClass {
	@Autowired
	private UseInterfaceClass useInterfaceClass;
	
	@Autowired
	private UseMethodClass useMethodClass;
	
	public SubClass() {
		
	}
	public void getInterfaceClassSubClass() {
		System.out.println("InterfaceClass ���� �Ϸ� :"+useInterfaceClass);
	}
	
	public void getMethodClassSubClass() {
		System.out.println("MethodClass ���� �Ϸ� : "+useMethodClass);
	}
}
