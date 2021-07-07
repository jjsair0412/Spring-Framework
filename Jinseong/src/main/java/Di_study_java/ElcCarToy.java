package Di_study_java;

public class ElcCarToy {
	
	// set 메서드를 사용해서, 생성되는 순간에는 객체를 주입시켜주지 않지만
	// 메서드를 활용해 사용자가 객체를 주입시킬 수 있도록 한다.
	private battery battery;
	public ElcCarToy() {
		
	}

	public void setBattery(battery battery) {
		this.battery = battery;
	}
}
