package Di_study_java;

public class ElcAirToy {
	// ElcAirToy��, ��ü�� �����Ǵ� �������� ��ü�� �����̵ǰ�,
	// set�޼��带 ����� ����ڰ� ���͸��� ���Խ�ų�� �ֵ��� �ߴ�.
	// ���� �ش� ��ü�� ���� �����ϴٰ� �� �� �ִ�.
	private battery battery;
	
	public ElcAirToy() {
		this.battery = new BadBat();
	}
	
	public void setElcAirToy(battery battery) {
		this.battery =battery;
	}

}
