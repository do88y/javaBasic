package JavaBase;

public class ConfirmEx1 {

	public static void main(String[] args) {
		// 1부터 100까지의 정수 중에서 3의 배수의 총합
		int sum=0;
		for(int i=1; i<=100; i++) {  // int i=3; i<=100; i+=3 으로 해도 답은 같다.
			if(i%3 == 0) {
			sum+=i;
			}
		}
		System.out.println("1부터 100까지 중에 3의 배수의 합= " + sum);
	}

}
