package Di_study_Spring;

public class ElcAirToy {
	// ElcAirToy��, ��ü�� �����Ǵ� �������� ��ü�� �����̵ǰ�,
	// set�޼��带 ����� ����ڰ� ���͸��� ���Խ�ų�� �ֵ��� �ߴ�.
	// ���� �ش� ��ü�� ���� �����ϴٰ� �� �� �ִ�.
	
	private battery2 battery;
	
	public ElcAirToy() {
		this.battery = new BadBat();
	}
	
	public void setElcAirToy(battery2 battery) {
		this.battery =battery;
	}

}
