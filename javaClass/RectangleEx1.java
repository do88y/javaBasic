package javaClass;

public class RectangleEx1 {

	public static void main(String[] args) {
		try {  // 클래스에서 throw 했기 때문에 받아줘야 함. 초기 설정 값부터 음수일 경우 메세지 띄우기 위해 exception 설정
		Rectangle rect1=new Rectangle(20, 30);
		int area=rect1.getArea();
		System.out.println("사각형의 너비: " + rect1.getWidth());  // 캡슐화 하면 너비와 높이를 가져올 수 없어서 출력 할 수 없기 때문에 getter와 setter가 필요하다.
		System.out.println("사각형의 높이: " + rect1.getHeight());  // rectangle 클래스로 돌아가서 설정 
		System.out.println("사각형의 면적: " + area);
		
		rect1.setWidth(50);
		rect1.setHeight(70);
		area=rect1.getArea();
		System.out.println("사각형의 너비: " + rect1.getWidth());  // 캡슐화 하면 너비와 높이를 가져올 수 없어서 출력 할 수 없기 때문에 getter와 setter가 필요하다.
		System.out.println("사각형의 높이: " + rect1.getHeight());  // rectangle 클래스로 돌아가서 설정 
		System.out.println("사각형의 면적: " + area);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
