package Auto_Di_Sutdy;

import javax.annotation.Resource;

public class Resource_class {
	// @Resource는 컨테이너에서 동일한 객체의 이름을 찾는다.
	// 해당 예제에선 컨테이너에 bean id중 personName2를 찾아준다.
	
	@Resource
	private PersonName2 personName2;
	
	public Resource_class() {
		// @Resource를 사용하기 위한 default 생성자
	}

	@Resource
	public void setPersonName2(PersonName2 personName2) {
		System.out.println("@Resource로 가져온 PersonName2 : "+personName2);
	}
	
}
