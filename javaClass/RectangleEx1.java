package javaClass;

public class RectangleEx1 {

	public static void main(String[] args) {
		try {  // Ŭ�������� throw �߱� ������ �޾���� ��. �ʱ� ���� ������ ������ ��� �޼��� ���� ���� exception ����
		Rectangle rect1=new Rectangle(20, 30);
		int area=rect1.getArea();
		System.out.println("�簢���� �ʺ�: " + rect1.getWidth());  // ĸ��ȭ �ϸ� �ʺ�� ���̸� ������ �� ��� ��� �� �� ���� ������ getter�� setter�� �ʿ��ϴ�.
		System.out.println("�簢���� ����: " + rect1.getHeight());  // rectangle Ŭ������ ���ư��� ���� 
		System.out.println("�簢���� ����: " + area);
		
		rect1.setWidth(50);
		rect1.setHeight(70);
		area=rect1.getArea();
		System.out.println("�簢���� �ʺ�: " + rect1.getWidth());  // ĸ��ȭ �ϸ� �ʺ�� ���̸� ������ �� ��� ��� �� �� ���� ������ getter�� setter�� �ʿ��ϴ�.
		System.out.println("�簢���� ����: " + rect1.getHeight());  // rectangle Ŭ������ ���ư��� ���� 
		System.out.println("�簢���� ����: " + area);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
