package JavaBase;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է����ּ���>>");
		int score=sc.nextInt();
		if(score>=0 && score<=100) {
			score/=10;  // score=score/10;
			switch(score) {
				case 10:  // break�� ��� case9�� �Ѿ�� A��� ���
				case 9:
					System.out.println("A���");
					break;
				case 8:
					System.out.println("B���");
					break;
				case 7:
					System.out.println("C���");
					break;
				case 6:
					System.out.println("D���");
					break;
				default:
					System.out.println("F���");
					break;
			}
					
		}
		
	}

}
