package LifeCycle;

public class UseMethodClass {
	// Method�� �̿��� �����, ������ �������Ͽ��� bean �±��� init-method �Ӽ���
	// destroy-method �Ӽ��� �����������ν� ����� �� �ִ�.
	public UseMethodClass() {
	}
	
	// ������ �Ӽ����� �������� initMethod()�� ���� �̸����� �����ؼ� , 
	// bean ��ü�� ������ �� �ؾ��ϴ� ����� �����Ѵ�.
	public void initMethod() {
		System.out.println("UseMethodClass bean ��ü ����!");
	}
	
	// ������ �Ӽ����� �������� destroyMethod()�� ���� �̸����� �����ؼ�, 
	// bean ��ü�� �Ҹ�� �� �ؾ��ϴ� ����� �����Ѵ�.
	public void destroyMethod() {
		System.out.println("UseMethodClass bean ��ü �Ҹ�!");
	}

}
