package JavaBase;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력해주세요>>");
		int score=sc.nextInt();
		if(score>=0 && score<=100) {
			score/=10;  // score=score/10;
			switch(score) {
				case 10:  // break가 없어서 case9로 넘어가서 A등급 출력
				case 9:
					System.out.println("A등급");
					break;
				case 8:
					System.out.println("B등급");
					break;
				case 7:
					System.out.println("C등급");
					break;
				case 6:
					System.out.println("D등급");
					break;
				default:
					System.out.println("F등급");
					break;
			}
					
		}
		
	}

}
