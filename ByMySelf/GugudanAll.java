package ByMySelf;

public class GugudanAll {

	public static void main(String[] args) {
		
		System.out.println("구구단을 외자");
		
		for(int i=2; i<=9; i++) {
			int[] dan= {i};
			System.out.println();
			System.out.println("** " + i + "단 **");
			
			  for(int j=1; j<=9; j++) {
				  int[] nums= {j};
				  System.out.println(i + " X " + j + " = " + i*j);
			  }
			 
		}
		
	}

}
