package JavaBase;

import java.util.Scanner;

public class IFStatementEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("������ �Է����ּ���>>");
		int score=sc.nextInt();
		if(score>=0 && score<=100) {  // �ؿ� ���� �� �ƹ� �����̳� ������ �� ����� ����ϰ� �������´�.
			if(score>=90) {
				if(score>=95) {  // score>=90 �� ������ ������ �� �� ������ �����.
					System.out.println("A+���");
				}
				System.out.println("A���");
			}else if(score>=80) {
				System.out.println("B���");
			}else if(score>=70) {
				System.out.println("C���");
			}else if(score>=60) {
				System.out.println("D���");
			}else {
				System.out.println("F���");
			}
		}else {  // score>=0 && score<=100 �� ������ �ƴ� �� �ٷ� ����� �´�.
			System.out.println("���� �Է� ����");
		}
		
	}

}
