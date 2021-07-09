package LifeCycle;

public class UseMethodClass {
	// Method를 이용한 방법은, 스프링 설정파일에서 bean 태그의 init-method 속성과
	// destroy-method 속성을 구성해줌으로써 사용할 수 있다.
	public UseMethodClass() {
	}
	
	// 스프링 속성에서 설정해준 initMethod()를 같은 이름으로 정의해서 , 
	// bean 객체가 생성될 때 해야하는 기능을 구성한다.
	public void initMethod() {
		System.out.println("UseMethodClass bean 객체 생성!");
	}
	
	// 스프링 속성에서 설정해준 destroyMethod()를 같은 이름으로 정의해서, 
	// bean 객체가 소멸될 때 해야하는 기능을 구성한다.
	public void destroyMethod() {
		System.out.println("UseMethodClass bean 객체 소멸!");
	}

}
