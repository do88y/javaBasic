package JavaBase;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {  // ���� Ǭ ����
		Scanner sc=new Scanner(System.in);
		System.out.print("��� �� ������?");
		int aplAmount=sc.nextInt();
		System.out.println("�� ��� ������ ��� ����=" + aplAmount/23);
		System.out.println("���� ��� ����=" + aplAmount%23);


	}

}
