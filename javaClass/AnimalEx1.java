package javaClass;

public class AnimalEx1 {

	public static void main(String[] args) {
		
		Tiger tiger1=new Tiger();
		Eagle eagle1=new Eagle();
		
		tiger1.name="대한이";  // name은 Animal 필드지만 tiger에서 상속 받았기 때문에 사용 가능
		tiger1.age=2;
		System.out.println(tiger1.name + "는 " + tiger1.age + "살 입니다.");
		tiger1.move();
		
		eagle1.name="대머리";
		eagle1.home="소나무둥지";
		System.out.println(eagle1.name + "는 " + eagle1.home + "에 삽니다.");
		eagle1.move();
		
	}

}
