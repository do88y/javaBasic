package ByMySelf;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class GugudanFor {

	public static void main(String[] args) {
		System.out.println("for������ ������ ������.");
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �� �� �ܿ��? ");
		int dan=sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
		}

	}

}
