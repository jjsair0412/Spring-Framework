package Di_study_java;

public class MainClass {
	public static void main(String[] args) {
		// ��ü�� �����Ǵ� �������� ��ü������ �̷������ ElctToy
		ElctToy firstToy = new ElctToy();
		
		System.out.println();
		
		// ��ü�� �����Ǵ� �������� ��ü������ �̷������ �ʰ�, �ش� Ŭ������ �޼��带 ���� ��ü�� ���ԵǴ� secondToy
		ElcCarToy secondToy = new ElcCarToy();
		secondToy.setBattery(new BadBat());
		
		System.out.println();
		
		// ��ü�� �����Ǵ� �������� ��ü ������ �̷������,
		// �ش� Ŭ������ set �޼��带 ���ؼ��� ��ü�� ���Խ�ų �� �ִ� thirdToy
		ElcAirToy thirdToy = new ElcAirToy();
		thirdToy.setElcAirToy(new goodBat());
		
	}
}
