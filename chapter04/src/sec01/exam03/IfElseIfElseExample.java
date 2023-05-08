package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		// 점수는 100점이 만점입니다.
		
		if(score>100) {
			System.out.println("점수가 100입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=90){
			System.out.println("점수가 90~99입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=80){
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 C입니다.");
			
		} else if (score>=70) {
		    System.out.println("점수가 70~79입니다.");
		    System.out.println("등급은 C입니다.");
			
		} else {
			System.out.println("점수가 60입니다.");
			System.out.println("등급은 D입니다.");
		}
	}

}
