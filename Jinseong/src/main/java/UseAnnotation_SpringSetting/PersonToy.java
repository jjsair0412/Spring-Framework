package UseAnnotation_SpringSetting;

import java.awt.List;
import java.util.ArrayList;

public class PersonToy {
	private Battery battery;
	private ArrayList<String> useMen;

	public PersonToy(Battery battery) {
		System.out.println("�ʱ� ���� : "+battery);
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	public void setBatteryResult(String result) {
		System.out.println("������� : "+result);
	}
	

	public void myBattery() {
		System.out.println("����峭�� ������� : "+ battery);
	}
	
	public void setUseperson(ArrayList<String> name) {
		this.useMen = name;
	}
	
	public void UseMens() {
		System.out.println("����ڵ� : "+useMen);
	}
	
}
