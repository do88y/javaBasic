package JavaBase;

public class OperatorEx6 {

	public static void main(String[] args) {
		int num1=70;
		int num2=50;
		int max=(num1>num2)?num1:num2;  // 삼항연산자 사용해서
		/*int max;  // max는 둘 중에 큰 값을 담을 변수
		if(num1>num2) {
			max=num1;
		}else {
			max=num2;
		}*/
		System.out.println("두 수 중 큰 값은 " + max +"입니다.");

	}

}
