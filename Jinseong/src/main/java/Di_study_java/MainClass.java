package Di_study_java;

public class MainClass {
	public static void main(String[] args) {
		// 객체가 생성되는 순간에만 객체주입이 이루어지는 ElctToy
		ElctToy firstToy = new ElctToy();
		
		System.out.println();
		
		// 객체가 생성되는 순간에는 객체주입이 이루어지지 않고, 해당 클래스의 메서드를 통해 객체가 주입되는 secondToy
		ElcCarToy secondToy = new ElcCarToy();
		secondToy.setBattery(new BadBat());
		
		System.out.println();
		
		// 객체가 생성되는 순간에도 객체 주입이 이루어지고,
		// 해당 클래스의 set 메서드를 통해서도 객체를 주입시킬 수 있는 thirdToy
		ElcAirToy thirdToy = new ElcAirToy();
		thirdToy.setElcAirToy(new goodBat());
		
	}
}
