package JavaBase;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {  // 내가 푼 문제
		Scanner sc=new Scanner(System.in);
		System.out.print("사과 총 개수는?");
		int aplAmount=sc.nextInt();
		System.out.println("한 명당 가지는 사과 개수=" + aplAmount/23);
		System.out.println("남는 사과 개수=" + aplAmount%23);


	}

}
