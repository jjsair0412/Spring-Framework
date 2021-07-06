package firstPjt;

public class MainClass {
	public static void main(String[] args) {
		TranspotationWalk trna = new TranspotationWalk();
		trna.move();
		// 여기까진 스프링과 관계가 없다.
		// 기존 자바형식과 같게 레퍼런스를 생성하고 객체의 메서드를 호출한다.
		
		// --- spring과 java의 차이점 ---
		// 일반 자바프로젝트는 순수 자바언어로만 가지고 프로젝트를 만든다
		// spring은, spring에 수많은 모듈들을 pron.xml파일을 이용해 모듈을 가져오고
		// 가져온 모듈들을 사용해 개발한다.
		
		// src\main\rescources의 xml에서는, 
		// ioc 컨테이너 안에있는 bean(객체)를 관리한다.
		
		
	}
}
