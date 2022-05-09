package JavaBase;

public class ForEx6 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++) {
			if(i%2 == 0) {  // 짝수일 때 나머지가 0이기 때문에 
				continue;  // 계속 반복
			}
			System.out.println(i);
		}*/
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				continue;
			}
			sum+=i;
		}  // for문 종료
		System.out.println("1부터 100까지의 합(3의배수 제외)=" + sum);  // 출력은 for문 밖에서 찍어야 함
	}

}
