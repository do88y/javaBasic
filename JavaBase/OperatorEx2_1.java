package JavaBase;

import java.util.Scanner;

public class OperatorEx2_1 {

	public static void main(String[] args) {  // �������� Ǭ ��
		Scanner sc=new Scanner(System.in);
		System.out.print("��� �� ������?");
		int aplAmount=sc.nextInt();
		/*System.out.println("�� ��� ������ ��� ����=" + aplAmount/23);
		System.out.println("���� ��� ����=" + aplAmount%23);*/
		int child=23;
		int applePerChild=aplAmount/child;  // ���� ������ ���ָ� ���̵� ���ڰ� �ٲ���� �� �� ���� ���ϰ� �ٲ� �� �ִ�.
		int remain=aplAmount%child;
		System.out.println("�� �� �� ������ ��� ����=" + applePerChild);
		System.out.println("���� ��� ����=" + remain);

	}

}
