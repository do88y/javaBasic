package JavaBase;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		System.out.print("�ݾ��Է�>>");
		Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();
	    int man=money/10000;
	    int ochun=(money-man*10000)/5000;  // (money-(money/10000)*10000)/5000
	    int chun=(money-man*10000-ochun*5000)/1000;  // (money-man*10000-ochun*5000)/1000
	    int obak=(money-man*10000-ochun*5000-chun*1000)/500;
	    int bak=(money-man*10000-ochun*5000-chun*1000-obak*500)/100;
	    int sib=(money-man*10000-ochun*5000-chun*1000-obak*500-bak*100)/10;
	    System.out.println("������->" + man + "��");
	    System.out.println("��õ����->" + ochun + "��");
	    System.out.println("õ����->" + chun + "��");
	    System.out.println("�������->" + obak + "��");
	    System.out.println("�����->" + bak + "��");
	    System.out.println("�ʿ���->" + sib + "��");

	}

}
