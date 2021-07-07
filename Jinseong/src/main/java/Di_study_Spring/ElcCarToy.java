package Di_study_Spring;

public class ElcCarToy {
	
	// set 메서드를 사용해서, 생성되는 순간에는 객체를 주입시켜주지 않지만
	// 메서드를 활용해 사용자가 객체를 주입시킬 수 있도록 한다.
	private battery2 battery;
	public ElcCarToy() {
		
	}

	public void setBattery(battery2 battery) {
		this.battery = battery;
	}
}
