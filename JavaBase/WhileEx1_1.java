package JavaBase;

public class WhileEx1_1 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;  // sum=sum+i;
			i++;
		}  // while문 종료
		System.out.println("1부터 100까지의 합= " + sum);

	}
}
