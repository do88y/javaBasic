package JavaBase;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("�������� ����(1.���� 2.���� 3.������)?");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1�� �ȳ�����ũ�� ������");
				break;  // break�� �� ���� �����ϰ� �� ���� ����� �ʰ� ��� ����
			case 2:
				System.out.println("2�� �ȳ�����ũ�� ������");
				break;
			case 3:
				System.out.println("���� �ȳ�����ũ�� ������");
				break;
			default:  // case �̿��� �ƹ� ���̳� �ԷµǾ��� �� default�� �´�.
				System.out.println("������ ������ �߸��Ǿ����ϴ�.");
				break;
			}
	}

}
