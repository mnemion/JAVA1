package sec02.exam03;

public class Tire {
	public int maxRotaition; //최대회전수
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotaition = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation< maxRotaition) {
			System.out.println(location + " Tire 수명: " + (maxRotaition-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}	
