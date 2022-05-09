package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee=new PhysicalInfo("이영희", 10, 135.5f, 38.0f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.0f, 48.5f);
		printPhysicalInfo(younghee);
		younghee.update(12, 157.0f);  // 뭄무게가 변하지 않은 경우, 변수 값이 비면 에러가 나서 무조건 써주어야 하는데
		printPhysicalInfo(younghee);
		younghee.update(13);  // 성장이 멈춰서 나이만 변한 경우

	}  // main
	
	public static void printPhysicalInfo(PhysicalInfo obj) {  // 일일이 찍지 않고 한 번에 print 하는 것
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println("-------------");
	}

}
