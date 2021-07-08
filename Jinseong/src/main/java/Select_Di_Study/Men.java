package Select_Di_Study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Men {
	@Autowired
	// 아까 스프링 설정파일에서 설정한 이름을 작성한다.
	// 주입되는 멤버변수의 이름과 스프링 설정파일에서 설정해둔 이름이 동일하다면, 같은 타입의 여러개의 bean들이 존재하더라도
	// @Autowired를 사용해 자동 주입을 시켜주면 정상적으로 작동한다.
	// 하지만 해당 방법은 , 코드의 가독성이 떨어지기 때문에 좋은 방법이 아니다.
	@Qualifier("usethisPencil")
	private Pencil pencil;
	
	public Men() {	
	}
	
	public void myPencil() {
		System.out.println("MyPencil is "+this.pencil);
	}
}
