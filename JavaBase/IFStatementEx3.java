package JavaBase;

import java.util.Scanner;

public class IFStatementEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ���̴�?");
		int age=sc.nextInt();
		if(age>=20 && age<30) {
			System.out.println("��ǰ ������ �����մϴ�.");
		}else {
			System.out.println("������ �� ���� ��ǰ�Դϴ�.");
		}

	}

}
