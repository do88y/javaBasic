package javaClass;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int num1=10;
			int num2=0;
			int result=num1/num2;
		System.out.println("���=" + result);
		}catch(ArithmeticException e) {  // catch ������ ������ ���� ������ �������� �ʴ´�
			System.out.println("0���� ������ ������");
		}
	}

}
