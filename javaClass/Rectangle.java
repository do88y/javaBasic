package javaClass;
// 사각형에 관련 된 클래스
public class Rectangle {
	// 필드 앞에 private를 붙이면 캡슐화(정보은닉)가 된다.
	private int width;  // 너비
	private int height;  // 높이
	
	// 생성자
	public Rectangle(int width, int height) throws Exception{  // 초기화 값부터 음수 설정을 막기 위해 인위적 exception을 만들어 준다.
		if(width <= 0 || height <=0) {  // 0 이하일 경우 exception 출력
			throw new Exception("너비와 높이는 플러스 값이어야 합니다.");
		}
		this.width=width;
		this.height=height;
	}
	
	// source->generate getters and setters->getter 선택 후 generate 하면 get~ 생성 됨
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}
	

	// 변경 된 값을 적용하고 싶을 때 setter 사용
	public void setWidth(int width) throws Exception{
		if(width <=0) {  // setter로 음수값 설정을 막기 위해 throw 설정 해 준다.
			throw new Exception("너비는 플러스 값이어야 합니다.");
		}
		this.width = width;
	}

	public void setHeight(int height) throws Exception{
		if(height <=0) {
			throw new Exception("높이는 플러스 값이어야 합니다.");
		}
		this.height = height;
	}

	// 사각형 면적 구하는 메서드
	int getArea() {  // 매개변수가 꼭 필요하지 않고 없을 수 있다.
//		int area=width*height;  바로 넘겨주면 되기 때문에 굳이 쓸 필요 없이 바로 return 해준다.
		return width*height;
	}
}
