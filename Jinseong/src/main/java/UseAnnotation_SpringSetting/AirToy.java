package UseAnnotation_SpringSetting;

import java.util.Map;

public class AirToy {
	private Map<String, String> realuseairtoyPerson;
	public AirToy(Battery battery) {
		System.out.println("���͸� ������� : "+battery);
	}
	public void setUseAirToy(Map<String, String> useairtoyPerson) {
		this.realuseairtoyPerson = useairtoyPerson;
	}
	public void useAirMens() {
		System.out.println("�ϴó��� �峭�� ����ڸ�� : "+realuseairtoyPerson);
	}
}
