package JavaBase;

public class VariableEx2 {

	public static void main(String[] args) {
		long num=3000000000L;  //초기화, L을 뒤에 붙여야 함.
		double dnum=12.5;
		boolean bool=true;
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(bool);
		int number=1;
		int result=number << 3;  // << 쉬프트연산자(비트 이동 연산자)-> 3비트 옆으로 이동하라는 것, 0001을 이동하면 1000이 돼서 8이 됨
		System.out.println(result);
		
	}

}
