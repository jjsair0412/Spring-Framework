package Auto_Di_Sutdy;

import javax.annotation.Resource;

public class Resource_class {
	// @Resource�� �����̳ʿ��� ������ ��ü�� �̸��� ã�´�.
	// �ش� �������� �����̳ʿ� bean id�� personName2�� ã���ش�.
	
	@Resource
	private PersonName2 personName2;
	
	public Resource_class() {
		// @Resource�� ����ϱ� ���� default ������
	}

	@Resource
	public void setPersonName2(PersonName2 personName2) {
		System.out.println("@Resource�� ������ PersonName2 : "+personName2);
	}
	
}
