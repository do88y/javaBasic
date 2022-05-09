package javaClass;

public class CheckingAccountEx1 {

	public static void main(String[] args) {
		CheckingAccount chulsu=new CheckingAccount("111-22-5555", "±èÃ¶¼ö", 1000, "2222-3333-5555-7777");
		chulsu.deposit(30000);
		try {
			int paidAmount=chulsu.pay("2222-3333-5555-7777", 15000);
			System.out.println("ÁöºÒ¾×: " + paidAmount);
			System.out.println("ÀÜ¾×: " + chulsu.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
