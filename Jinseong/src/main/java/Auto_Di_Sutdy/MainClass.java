package Auto_Di_Sutdy;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// 컨테이너 생성
		GenericXmlApplicationContext gen = new GenericXmlApplicationContext("classpath:AutodiContext.xml");
		
		Autowired_class autoClass = gen.getBean("Autowired_class", Autowired_class.class);
		
		Resource_class resourceClass = gen.getBean("Resource_class", Resource_class.class);
		
	}

}	
