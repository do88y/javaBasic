package JavaBase;

public class ForEx8 {

	public static void main(String[] args) {
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}  // 내부 for문 종료
			System.out.println();
		}  // 외부 for문*/
		
		for(int i=5; i>=1; i--) {  // for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {  // for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
