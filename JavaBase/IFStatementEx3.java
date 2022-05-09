package JavaBase;

import java.util.Scanner;

public class IFStatementEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 나이는?");
		int age=sc.nextInt();
		if(age>=20 && age<30) {
			System.out.println("상품 가입이 가능합니다.");
		}else {
			System.out.println("가입할 수 없는 상품입니다.");
		}

	}

}
