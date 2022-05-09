package javaClass;

public class Tire {
	// 필드
	public int maxRotation;  // 타이어 수명
	public int accumulatedRotation;  // 누적회전수
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {  // 누적회전수는 증가연산자 이용해 연산하고 메소드로 입력을 안 받을거라서 생성자에 추가 안 해도 됨.
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	// 메서드
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어의 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;  // 운행 계속 됨
		}else {
			System.out.println("***" + location + " 타이어 펑크 ***");
			return false;  // 운행 멈춤
		}
	}

}
