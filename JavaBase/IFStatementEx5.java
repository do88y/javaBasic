package JavaBase;

public class IFStatementEx5 {

	public static void main(String[] args) {
		int score=90;
		if(score>=80) {
			System.out.println("합격하셨습니다.");
		}else if(score>=70 && score<=79) {  // 위에  조건에 80점 이상이었기 때문에 && 안 써도 됨
			System.out.println("대기자입니다.");
		}else {
		System.out.println("불합격입니다.");
		}
	}

}


