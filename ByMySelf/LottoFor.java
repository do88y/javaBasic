package ByMySelf;

public class LottoFor {

	public static void main(String[] args) {
		System.out.println("이번주 로또 번호");
		for(int i=1; i<=6; i++) {
			int lotto=(int)(Math.random()*45)+1;
			System.out.println(lotto);
		}

	}

}
