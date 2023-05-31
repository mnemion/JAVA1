package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override
//	public void stop() {
//		System.out.println("stop 메소드는 final이라 제정의가 안 된다.");
//	}
}
