package UseAnnotation_SpringSetting;

import java.util.Map;

public class AirToy {
	private Map<String, String> realuseairtoyPerson;
	public AirToy(Battery battery) {
		System.out.println("배터리 충전결과 : "+battery);
	}
	public void setUseAirToy(Map<String, String> useairtoyPerson) {
		this.realuseairtoyPerson = useairtoyPerson;
	}
	public void useAirMens() {
		System.out.println("하늘나는 장난감 사용자명단 : "+realuseairtoyPerson);
	}
}
