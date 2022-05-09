package javaClass;
// 첨성대 클래스(singleton)
public class Cheomseongdae {
	// 정적 필드
	private static Cheomseongdae cheom=new Cheomseongdae();
	
	// 생성자
	private Cheomseongdae() {
		
	}
	
	// 정적 메서드
	static Cheomseongdae getInstance() {  // getInstance는 메소드
		return cheom;
	}
	
	void history() {
		System.out.println("동양에서 가장 오래된 관측대");
	}
}
