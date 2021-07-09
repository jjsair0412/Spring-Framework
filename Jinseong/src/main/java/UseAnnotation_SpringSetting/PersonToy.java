package UseAnnotation_SpringSetting;

import java.awt.List;
import java.util.ArrayList;

public class PersonToy {
	private Battery battery;
	private ArrayList<String> useMen;

	public PersonToy(Battery battery) {
		System.out.println("초기 설정 : "+battery);
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	public void setBatteryResult(String result) {
		System.out.println("충전결과 : "+result);
	}
	

	public void myBattery() {
		System.out.println("사람장난감 충전결과 : "+ battery);
	}
	
	public void setUseperson(ArrayList<String> name) {
		this.useMen = name;
	}
	
	public void UseMens() {
		System.out.println("사용자들 : "+useMen);
	}
	
}
