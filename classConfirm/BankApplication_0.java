package classConfirm;

import java.lang.module.FindException;
import java.util.Scanner;

public class BankApplication_0 {
	private static Account[] accountArray=new Account[100];  // ��������->���� �޼��� �ۿ� ����� ��ü�� ����ȴ�.
	private static Scanner scanner=new Scanner(System.in);
	static int count=0;
	// ���� �޼���
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("����> ");
			int selectNo=scanner.nextInt();
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run=false;
				break;
			}
		}  // while
		System.out.println("���α׷� ����");
		
	}  // main
	
	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		System.out.print("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.print("������: ");
		String owner=scanner.next();
		System.out.print("�ʱ��Ա޾�: ");
		int balance=scanner.nextInt();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i]=new Account(ano, owner, balance);
				break;
			}
		}
//		accountArray[count]=new Account(ano, owner, balance);  // ���� ����� �迭�� ����
//		count++;
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	
	// ���� ��� ����
	private static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("-------");
		for(int i=0; i<count; i++) {
			System.out.print(accountArray[i].getAno()+"   ");
			System.out.print(accountArray[i].getOwner()+"   ");
			System.out.println(accountArray[i].getBalance()+"   ");
		}
		
	}
		
	// �����ϱ�
	private static void deposit() {
		System.out.println("-------");
		System.out.println("����");
		System.out.println("-------");
		System.out.print("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.print("���ݾ�: ");
		int deposit=scanner.nextInt();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�");
		}else {
			account.setBalance(account.getBalance()+deposit);
			System.out.println("���: ������ �����Ͽ����ϴ�.");
		}
	}
	
	// ����ϱ�
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.println("��ݾ�: ");
		int withdraw=scanner.nextInt();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�");
		}else {
			account.setBalance(account.getBalance()-withdraw);
			System.out.println("���: ����� �����Ͽ����ϴ�.");
		}
		
	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {  // Account�� ���� findAccount�� �����̸� ano�� �Ű�����. Account  �տ�  void ���̴ϱ� findAccount ���ο� ������ ����.
		Account account=null;
		for(int i=0; i<count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				account=accountArray[i];
				break;
			}
		}
		return account;
	}
}
