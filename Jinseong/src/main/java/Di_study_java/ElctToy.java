package Di_study_java;

public class ElctToy {
	// ElctToy는 객체가 생성되는 그 순간에만 객체를 주입시켜준다.
	private battery battery;
	public ElctToy() {
		this.battery = new goodBat();
	}
}
