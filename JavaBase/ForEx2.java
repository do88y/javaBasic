                                                                                                                                                                                                                                                                                                                                                                 package JavaBase;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ϴ� ����? ");
		int dan=sc.nextInt();
		System.out.println("** " + dan + "��  **");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
		
	}

}
