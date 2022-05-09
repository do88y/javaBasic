package JavaBase;

public class OperatorEx5 {

	public static void main(String[] args) {
		double dnum=236.5241;  // 이 숫자를 소수점 둘째자리까지 나타내는 방법은?
		dnum=(int)(dnum*100)/100.0;  // (dnum*100) 먼저 계산 한 후 (int)로 정수로 타입 변환->100.0을 나눠서 실수 형태로 변환
		System.out.println(dnum);

	}

}
