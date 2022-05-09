package javaClass;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();  // 생성자가 없으면 디폴트 생성자 저절로 생긴다.
		int[] value1= {10,85,31,64,33};
		int result1=myCalc.sum1(value1);
		System.out.println("배열의 총합=" + result1);
		int result2=myCalc.sum1(new int[] {85,90,67});  // 이름 없이 익명으로 넘겨줄 수도 있다.
		System.out.println("배열의 총합=" + result2);
		
		int result3=myCalc.sum2(20, 80, 60);
		System.out.println("자료의 총합=" + result3);
		int result4=myCalc.sum2(85,47,38,94,27);  // 매개변수를 정해진 수만큼 받도록 만들면 숫자가 달라졌을 때 에러가 나지만  ...을 쓰면 매개변수의 수가 달라져도 에러가 안 난다
		System.out.println("자료의 총합=" + result4);
		double result5=myCalc.avg2(45,96,74,36,95);
		System.out.println("자료의 평균=" + result5);  // 평균을 구하려면 총합이 있어야하기 때문에 클래스 내부에 있는 메서드를 호출해서 사용한다.
	}

}
