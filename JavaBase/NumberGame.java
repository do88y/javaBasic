package JavaBase;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		System.out.println("** 1부터 100 사이의 숫자를 맞추는 게임 **");
		int comNum=(int)(Math.random()*100)+1;  // 0.00...xx *100->정수변환->+1->결과 1
		int count=0;
		Scanner sc=new Scanner(System.in);
		int myNum;
		while(true) {
			System.out.print("숫자 입력>> ");
			myNum=sc.nextInt();
			if(myNum<=100 && myNum>=1) {
				count++;  // 이 명령문을 넣은 이유는 카운트 해야 이긴 사람이 나오기 때문
				if(myNum > comNum) {
					System.out.println("당신의 숫자가 커요. 좀 더 작은 수를 넣어보세요.");
				}else if(myNum < comNum) {
					System.out.println("당신의 숫자가 작아요. 좀 더 큰 수를 넣어보세요.");
				}else {
					System.out.println("축하합니다. 맞추셨습니다. (시도 횟수= " + count + ")");
					break;
					}
				}else {
					System.out.println("1부터 100 사이의 숫자를 입력하세요.");  // 1~100 사이의 숫자 외의 숫자나 문자 입력 시 출력되도록.
				}
		
		}  // while문
		System.out.println("게임이 종료되었습니다.");
	}

}
