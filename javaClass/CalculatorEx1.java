package javaClass;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();  // �����ڰ� ������ ����Ʈ ������ ������ �����.
		int[] value1= {10,85,31,64,33};
		int result1=myCalc.sum1(value1);
		System.out.println("�迭�� ����=" + result1);
		int result2=myCalc.sum1(new int[] {85,90,67});  // �̸� ���� �͸����� �Ѱ��� ���� �ִ�.
		System.out.println("�迭�� ����=" + result2);
		
		int result3=myCalc.sum2(20, 80, 60);
		System.out.println("�ڷ��� ����=" + result3);
		int result4=myCalc.sum2(85,47,38,94,27);  // �Ű������� ������ ����ŭ �޵��� ����� ���ڰ� �޶����� �� ������ ������  ...�� ���� �Ű������� ���� �޶����� ������ �� ����
		System.out.println("�ڷ��� ����=" + result4);
		double result5=myCalc.avg2(45,96,74,36,95);
		System.out.println("�ڷ��� ���=" + result5);  // ����� ���Ϸ��� ������ �־���ϱ� ������ Ŭ���� ���ο� �ִ� �޼��带 ȣ���ؼ� ����Ѵ�.
	}

}
