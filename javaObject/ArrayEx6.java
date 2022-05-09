package javaObject;

public class ArrayEx6 {

	public static void main(String[] args) {
		/*String[] names= {"김철수","이영희","홍길동","박찬호","이영표"};  // string도 참조라서 참조의 참조
		System.out.println(names[0]);*/
		if(args.length == 2) {
			int num1=Integer.parseInt(args[0]);  //Integer는 클래스, parseInt는 메소드
			int num2=Integer.parseInt(args[1]);
			int result=num1+num2;  // run 버튼 옆에 역삼각형 버튼->run configurations->Arguments->program Arguments에 값 입력
			System.out.println("두 수의 합=" + result);
		}else {
			System.out.println("매개변수 값이 없습니다.");
		}

	}

}
