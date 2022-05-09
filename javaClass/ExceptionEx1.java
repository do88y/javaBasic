package javaClass;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int num1=10;
			int num2=0;
			int result=num1/num2;
		System.out.println("결과=" + result);
		}catch(ArithmeticException e) {  // catch 영역은 오류가 나지 않으면 수행하지 않는다
			System.out.println("0으로 나누지 마세요");
		}
	}

}
