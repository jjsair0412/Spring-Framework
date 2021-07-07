package Di_study_java;

public class ElcAirToy {
	// ElcAirToy는, 객체가 생성되는 순간에도 객체가 주입이되고,
	// set메서드를 사용해 사용자가 베터리를 주입시킬수 있도록 했다.
	// 따라서 해당 객체가 가장 유연하다고 볼 수 있다.
	private battery battery;
	
	public ElcAirToy() {
		this.battery = new BadBat();
	}
	
	public void setElcAirToy(battery battery) {
		this.battery =battery;
	}

}
