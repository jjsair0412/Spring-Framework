package Select_Di_Study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Men {
	@Autowired
	// �Ʊ� ������ �������Ͽ��� ������ �̸��� �ۼ��Ѵ�.
	// ���ԵǴ� ��������� �̸��� ������ �������Ͽ��� �����ص� �̸��� �����ϴٸ�, ���� Ÿ���� �������� bean���� �����ϴ���
	// @Autowired�� ����� �ڵ� ������ �����ָ� ���������� �۵��Ѵ�.
	// ������ �ش� ����� , �ڵ��� �������� �������� ������ ���� ����� �ƴϴ�.
	@Qualifier("usethisPencil")
	private Pencil pencil;
	
	public Men() {	
	}
	
	public void myPencil() {
		System.out.println("MyPencil is "+this.pencil);
	}
}
