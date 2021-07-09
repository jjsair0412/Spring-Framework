package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UseInterfaceClass implements InitializingBean, DisposableBean{
	// InitializingBean interface��  DisposableBean interface�� �̿��ؼ� ,
	// �ش� Ŭ������ bean���� �����Ǵ� �Ҹ�ɶ�, Ư�� ����� �־��� �� �ִ�.
	// ���� �� �������� �۾��ϰԲ� ������ ���� �ִ�.
	
	public UseInterfaceClass() {
		
	}

	
	public void afterPropertiesSet() throws Exception {
		// InitializingBean interface�ȿ� ���ǵǾ��ִ� �޼���
		// �ش� �޼��忡 bean ��ü�� �����Ǹ鼭 �����ؾ� �� ��ɵ��� �ۼ��ϸ� �ȴ�.
		System.out.println("UseInterface bean ��ü ����!");
		
	}
	
	public void destroy() throws Exception {
		// DisposableBean interface�ȿ� ���ǵǾ��ִ� �޼���
		// �ش� �޼��忡 bean ��ü�� �Ҹ�Ǹ鼭 �����ؾ� �� ����� �ۼ��ϸ� �ȴ�.
		System.out.println("UseInterface bean ��ü �Ҹ�!");
		
	}

}
