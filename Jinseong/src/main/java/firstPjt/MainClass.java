package firstPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TranspotationWalk trna = new TranspotationWalk();
//		trna.move();
		// ������� �������� ���谡 ����.
		// ���� �ڹ����İ� ���� ���۷����� �����ϰ� ��ü�� �޼��带 ȣ���Ѵ�.
		
		// --- spring�� java�� ������ ---
		// �Ϲ� �ڹ�������Ʈ�� ���� �ڹپ��θ� ������ ������Ʈ�� �����
		// spring��, spring�� ������ ������ pron.xml������ �̿��� ����� ��������
		// ������ ������ ����� �����Ѵ�.
		
		// src\main\rescources�� xml������, 
		// ioc �����̳� �ȿ��ִ� bean(��ü)�� �����Ѵ�.
		
		// GenericXmlApplicationContext ������Ÿ���� �����̳ʿ� �����ϱ����� ������Ÿ���̴�.
		// �Ķ���Ͱ����� �ڿ� �̸��� �����ش�
		// classpath:"xml���ϸ�"
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:Application_context.xml");
		
		// �����̳ʾȿ��ִ� bean�� �������� �޼���
		// �Ķ���Ͱ����� �Ʊ� �������־��� id��, Ŭ�������� �ۼ�
		// id���� tWalk, ������Ÿ���� TranspotationWalk.class
		TranspotationWalk transpotationWalk = ctx.getBean("tWalk",TranspotationWalk.class);
		transpotationWalk.move();
		
		// ��ȯ�Ѵ�.
		ctx.close();
	}
}
