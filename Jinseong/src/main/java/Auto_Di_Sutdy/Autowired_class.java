package Auto_Di_Sutdy;

import org.springframework.beans.factory.annotation.Autowired;

public class Autowired_class {
	// @Autowired�� ��������� �����ڿ��� �־��� �� �ִ�.
	// �� �޼��峪 ��������� Autowired�� ����Ϸ��� ����Ʈ �����ڸ� ����� �־�� �Ѵ�.
	// �ֳ��ϸ�, ��ü�� ������ �Ǿ� ��������� �޼��忡 ��ü�� ����� �־��� �� �ֱ� �����̴�.
	// ���� @Autowired�� ������� ���� Ŀ���һ����ڸ� �����Ѵٸ� ���ϴ� ��ü�� �����̳ʿ��� 
	// ã�� ������� �ʾұ� ������ �ڵ� ������ ���� �ʴ´�.
	// �����ڿ� @Autowired�� ���� ��쿣 ������鼭 ��ü�� �����Ǳ� ������ ������.
	
	@Autowired
	private PersonName1 personName1;
	
	@Autowired
	public Autowired_class(PersonName1 personName1) {
		this.personName1 = personName1;
	}
	
	@Autowired
	public void setPersonName1(PersonName1 personName1) {
		System.out.println("@Autowired�� �޾ƿ� PersonName1 : "+ personName1);
	}
}
