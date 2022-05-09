package javaClass;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name=name;  이렇게 하면 부모 생성자를 호출하지 않았기 때문에 오류가 난다. super 명령으로 호출해줘야 함
		super(name);
		this.studentNo=studentNo;
	}

}
