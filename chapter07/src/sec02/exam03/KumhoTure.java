package sec02.exam03;

public class KumhoTure extends Tire {
	public KumhoTure(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation< maxRotaition) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotaition-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
	}
	}
	
}
