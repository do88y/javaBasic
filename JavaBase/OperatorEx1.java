package JavaBase;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������?");  // ln �� ������ ���� ���� �Է� Ŀ���� ���� �ϱ� ����
		int amount=sc.nextInt();
		int price=2000;
		int salesPrice=amount*price;
		System.out.println("�� �ǸŰ���=" + salesPrice);  // salesPrice�� ����ȭ �ȴ�.
		
	}

}
