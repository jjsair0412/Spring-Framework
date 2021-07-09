package UseAnnotation_SpringSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;

public class UseAnnotationConfig2 extends UseAnnotationConfig{
	
	// �Ķ���Ͱ����� list�� ���� ��� xml������ <list></list>�±׸� ����ߴ�.
		// java������ arraylist�� ����Ѵ�.
		// �ش� �޼��忡�� ���� Arraylist�� �����ؼ� ����Ѵ�.
		@Bean
		public PersonToy personToyList() {
			ArrayList<String> usePerson = new ArrayList<String>();
			usePerson.add("������");
			usePerson.add("��--");
			usePerson.add("ȫ���");
			personToy.setUseperson(usePerson);
			
			return personToy;
		}
		
		// �Ķ���Ͱ��� Map���� �޴°�쿡��, Arraylist�ι޴� ���� �Ȱ��� �ϸ� �ȴ�.
		@Bean
		public AirToy airToyMap() {
			Map<String, String> airUsePerson = new HashMap<String, String>();
			airUsePerson.put("1�� �����", "��--");
			airUsePerson.put("2�� �����", "��--");
			airUsePerson.put("3�� �����", "��--");
			
			airToy.setUseAirToy(airUsePerson);
			
			return airToy;
		}
}
