package ByMySelf;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class GugudanFor {

	public static void main(String[] args) {
		System.out.println("for문으로 구구단 껌이죠.");
		Scanner sc=new Scanner(System.in);
		System.out.print("님 몇 단 외우실? ");
		int dan=sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
		}

	}

}
