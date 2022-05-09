package JavaBase;

public class ForEx12 {

	public static void main(String[] args) {
	Outer: for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i + "," + j + "= " + i*j);
				if(i*j==15) {
					break Outer;  // 내부 for문만 탈출하고 외부 for문은 탈출 못 하기 때문에 탈출할 수 있도록 outer로 탈출할 곳 설정
				}
			}  //내부 for문
		}  // 외부 for문
		System.out.println("프로그램 종료");
	}
			

}
