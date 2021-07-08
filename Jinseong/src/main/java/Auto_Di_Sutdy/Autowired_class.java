package Auto_Di_Sutdy;

import org.springframework.beans.factory.annotation.Autowired;

public class Autowired_class {
	// @Autowired는 멤버변수나 생성자에도 넣어줄 수 있다.
	// 단 메서드나 멤버변수에 Autowired를 사용하려면 디폴트 생성자를 명시해 주어야 한다.
	// 왜냐하면, 객체가 생성이 되야 멤버변수나 메서드에 객체를 끌어와 넣어줄 수 있기 때문이다.
	// 만약 @Autowired를 사용하지 않은 커스텀생성자만 존재한다면 원하는 객체를 컨테이너에서 
	// 찾아 끌어오지 않았기 때문에 자동 주입이 되지 않는다.
	// 생성자에 @Autowired를 했을 경우엔 끌어오면서 객체가 생성되기 때문에 괜찮다.
	
	@Autowired
	private PersonName1 personName1;
	
	@Autowired
	public Autowired_class(PersonName1 personName1) {
		this.personName1 = personName1;
	}
	
	@Autowired
	public void setPersonName1(PersonName1 personName1) {
		System.out.println("@Autowired로 받아온 PersonName1 : "+ personName1);
	}
}
