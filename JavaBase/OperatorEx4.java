package JavaBase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������?");
		int amount=sc.nextInt();
		int price=1000;
		String memo="(����)";
		if(amount>=10) {
			price=800;  // ���� �����ϸ� 1000������ �����ߴ� price�� 800���� �ٲ��.
			memo="(���ΰ�)";  // ���� ���� �� memo�� "���ΰ�" ��� ���ڷ� �ٲ��.
		}
		int salesPrice=amount*price;
		System.out.println("�ǸŰ���=" + salesPrice + memo);
		}

	}
