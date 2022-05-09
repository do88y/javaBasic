package JavaBase;

public class ForEx11 {

	public static void main(String[] args) {
		System.out.println("구구단을 외우자");
		for(int dan=2; dan<=9; dan++) {
			System.out.println("** " + dan + "단  **");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " X " + i + " = " + dan*i);
			}  // 내부  for문
			System.out.println();
		}  // 외부 for문

	}
}
