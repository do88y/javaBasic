package ByMySelf;

import java.util.Scanner;

public class SamYukGu {

	public static void main(String[] args) {
		System.out.println("369���� start!");
		while(true) {
		System.out.print("1���� 100 ������ ���ڸ� �Է��ϼ���>> ");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
			if(myNum == 3 || myNum == 6 || myNum == 9) {  // 3 6 9 �϶� ¦
				System.out.println("¦");
			}else if(myNum%10 == 3 || myNum%10 == 6 || myNum%10 == 9) {  // ù°�ڸ��� 3 6 9�� �� �� ¦
				System.out.println("¦");
			}
		}// while

	}

}
