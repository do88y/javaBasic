package JavaBase;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		String input;  // string�� ���ڿ��� ���� �� �ִ�. ���� ���� �� �ִ� ���� �Է�
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("�Է� �� ����>>");
			input=sc.nextLine();
			System.out.println("����� �Է��� ����: " + input);
		}while(!input.equals("q"));  // !�� NOT�� �ǹ�. �Է� ������ q�� ���� �ʳİ� ���� ��
		System.out.println("���α׷� ����");

	}

}
