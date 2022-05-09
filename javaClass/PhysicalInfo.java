package javaClass;
// 신체정보를 기록하는 클래스
public class PhysicalInfo {
	
	// 필드-값이 저장되는 곳
	String name;  // 이름
	int age;  // 나이
	float height, weight;  // 키와 몸무게
	
	// 생성자-객체의 초기화를 담당
	public PhysicalInfo(String name, int age, float height, float weight) {  // () 안은 매개면수->필드랑 이름이 같은 경우 this로 구분한다.
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	// 메서드-하는 일
	void update(int age) {
		this.age=age;
	}
	void update(int age, float height) {  // update라는 메서드 이름 만든 것．매개변수는　이웃집이　떡　담아　준　돌려줘야 할 그릇
		this.age=age;  // this 붙은 건 우리 집 그릇
		this.height=height;
	}
	void update(int age, float height, float weight) {  // 메서드 오버로딩-> 클래스 내에 똑같은 메서드가 또 있으면 오류지만 매개변수의 갯수가 다르거나 타입이 다르거나 순서가 다르면 가능
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}
