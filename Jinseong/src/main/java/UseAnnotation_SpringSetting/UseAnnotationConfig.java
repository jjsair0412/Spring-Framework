package UseAnnotation_SpringSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration ������̼��� ����Ѵٸ�,
// xml�� ����ѰͰ� �����ϰ� ������ �����̳ʷ� ����� �� �ִ�.
@Configuration
public class UseAnnotationConfig {
	
	PersonToy personToy = new PersonToy(new Battery());
	AirToy airToy= new AirToy(new Battery());
	// ����Ҷ����� �����ڿ� ��ü�� ���Խ�Ű�»�Ȳ�̱� ������, �̸� ���Խ��ѳ��� ����ϰڴ�
	
	// �ش� class������ xml������ ����ؼ� ������ �����̳ʸ� �����Ҽ� �־�� �Ѵ�.
	
	// xml���� bean ��ü�� ������ ��,
	// <bean id = "battery" class ="DI_study_Spring_Simple.Battery"/>
	// �̷��� ����ߴ�.
	
	// Java���� bean�� �����Ҷ� �޼��带 �̿��Ѵ�.
	// ��ȯ���� ������� �ϴ� ��ü�� ������Ÿ���� �ۼ��Ѵ�.
	// ���⼱ UseInterfaceClass�� �ۼ��Ѵ�.
	// �� ��, id�� �ۼ��Ѵ�.
	// ���������� new Ű����� �������ذ��� ��ȯ���ְ�, ���� @Bean ������̼��� �߰����ָ� �ȴ�.
	@Bean
	public Battery battery() {
		return new Battery();
	}
	
	// ���� �����ڿ� ��ü�� ���Խ��Ѿ� �Ѵٸ�, new Ű����� ������ �� �Ķ���Ͱ����� �־��ָ� �ȴ�.
	@Bean
	public PersonToy personToy() {
		
//		return new PersonToy(new Battery());
		return personToy;
	}
	
	@Bean
	public AirToy airToy() {
//		return new AirToy(new Battery());
		return airToy;
	}
	
	// ���� � Ŭ������ �޼���ȿ� �Ķ���Ͱ��� �־��־�� �Ѵٸ�, �ϴ�ó�� �ۼ��Ѵ�.
	// ���� �ڹٿ� ���� ���۷����� �����ѵ�, ���������ڸ� ���� �ĸ����͸� �־��ش�.
	// ���������� ��ȯ�����ش�.
	// �ش� ���������� �Ķ���� ������Ÿ���� String�̴�.
	@Bean
	public PersonToy personToyBatteryset() {
		personToy.setBatteryResult("�����Ϸ��߾��");
		return personToy;
	}
	
			
}
