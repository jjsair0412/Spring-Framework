package UseAnnotation_SpringSetting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class MainClass {
	public static void main(String[] args) {

		// ������ �����, xml�� �̿��� ������ �����̳ʸ� ����� ������� �����̳� ������ bean��
		// getBean�ϴ� ������� ����ߴ�.
		
		
		// xml�� ����ϴ� ��� �ϴ�ó�� GenericXmlApplicationContext�� ����ߴ�.
//		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:SimpleExContext.xml");
		// java�� ����Ҷ� AnnotationConfigApplicationContext�� ����ϸ� �ȴ�.
		// �Ķ���Ͱ����δ�, ����� ������ class�� ������ָ� �ȴ�.
		// java �����̳ʸ� �ΰ����� �������� ������,�迭 �������� ����� �׳� ���ָ� �ȴ�.
		// ����� ������� �ʴ���, �ϳ��� �����̳�.java ���Ͽ��� import�ؼ� ����� ���� �ִ�.
		// import�� ������ �Ķ���Ͱ����� �־��ش�. import�� @Configuration�ϴܿ� �ۼ��ϰ�, ���� �߰�ȣ�� �����ָ� �ȴ�.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UseAnnotationConfig.class, UseAnnotationConfig2.class);
		
		// ����, �ش� �����̳��� getBean�ϴ°��� �����ϰ� �ؼ� �޼��带 ������ ���� �ȴ�.
		// id������ �޼��带 �����آZ���µ�, �޼��忡�� ��ȣ�� ���� getBean�� id���� �־��ָ� �ȴ�.
		PersonToy per = ctx.getBean("personToy",PersonToy.class);
		per.UseMens();
		
		AirToy airToy = ctx.getBean("airToy",AirToy.class);
		airToy.useAirMens();
	}
	
}
