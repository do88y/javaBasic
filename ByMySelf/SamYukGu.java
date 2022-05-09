package ByMySelf;

import java.util.Scanner;

public class SamYukGu {

	public static void main(String[] args) {
		System.out.println("369게임 start!");
		while(true) {
		System.out.print("1부터 100 사이의 숫자를 입력하세요>> ");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
			if(myNum == 3 || myNum == 6 || myNum == 9) {  // 3 6 9 일때 짝
				System.out.println("짝");
			}else if(myNum%10 == 3 || myNum%10 == 6 || myNum%10 == 9) {  // 첫째자리에 3 6 9가 들어갈 때 짝
				System.out.println("짝");
			}
		}// while

	}

}
