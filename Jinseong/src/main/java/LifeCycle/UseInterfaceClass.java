package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UseInterfaceClass implements InitializingBean, DisposableBean{
	// InitializingBean interface와  DisposableBean interface를 이용해서 ,
	// 해당 클래스가 bean으로 생성또는 소멸될때, 특정 기능을 넣어줄 수 있다.
	// 둘중 한 시점에만 작업하게끔 구현할 수도 있다.
	
	public UseInterfaceClass() {
		
	}

	
	public void afterPropertiesSet() throws Exception {
		// InitializingBean interface안에 정의되어있던 메서드
		// 해당 메서드에 bean 객체가 생성되면서 수행해야 할 기능들을 작성하면 된다.
		System.out.println("UseInterface bean 객체 생성!");
		
	}
	
	public void destroy() throws Exception {
		// DisposableBean interface안에 정의되어있던 메서드
		// 해당 메서드에 bean 객체가 소멸되면서 수행해야 할 기능을 작성하면 된다.
		System.out.println("UseInterface bean 객체 소멸!");
		
	}

}
