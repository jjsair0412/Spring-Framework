package UseAnnotation_SpringSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;

public class UseAnnotationConfig2 extends UseAnnotationConfig{
	
	// 파라미터값으로 list가 들어가는 경우 xml에서는 <list></list>태그를 사용했다.
		// java에서는 arraylist를 사용한다.
		// 해당 메서드에서 따로 Arraylist를 생성해서 사용한다.
		@Bean
		public PersonToy personToyList() {
			ArrayList<String> usePerson = new ArrayList<String>();
			usePerson.add("주진성");
			usePerson.add("주--");
			usePerson.add("홍길똥");
			personToy.setUseperson(usePerson);
			
			return personToy;
		}
		
		// 파라미터값을 Map으로 받는경우에도, Arraylist로받는 경우와 똑같이 하면 된다.
		@Bean
		public AirToy airToyMap() {
			Map<String, String> airUsePerson = new HashMap<String, String>();
			airUsePerson.put("1번 사용자", "김--");
			airUsePerson.put("2번 사용자", "이--");
			airUsePerson.put("3번 사용자", "최--");
			
			airToy.setUseAirToy(airUsePerson);
			
			return airToy;
		}
}
