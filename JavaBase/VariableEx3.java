package JavaBase;

public class VariableEx3 {

	public static void main(String[] args) {
		byte num1=100;
		byte num2=100;
		int result=num1+num2;  //byte로 하면 에러나는데 이유는 연산장치 거치면 무조건 int로 변환되기 때문
		System.out.println("두 수의 합=" + result);
		char ch=44033;  // 44033은 각이라는 한글로 출력된다.
		System.out.println(ch);
		System.out.println(23+511);
		

	}

}
