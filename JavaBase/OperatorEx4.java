package JavaBase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("구입 수량은?");
		int amount=sc.nextInt();
		int price=1000;
		String memo="(정상가)";
		if(amount>=10) {
			price=800;  // 조건 만족하면 1000원으로 대입했던 price가 800으로 바뀐다.
			memo="(할인가)";  // 조건 만족 시 memo도 "할인가" 라는 문자로 바뀐다.
		}
		int salesPrice=amount*price;
		System.out.println("판매가격=" + salesPrice + memo);
		}

	}
