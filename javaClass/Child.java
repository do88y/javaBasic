package javaClass;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name=name;  �̷��� �ϸ� �θ� �����ڸ� ȣ������ �ʾұ� ������ ������ ����. super ������� ȣ������� ��
		super(name);
		this.studentNo=studentNo;
	}

}
