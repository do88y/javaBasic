package JavaBase;

public class ForEx5 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++) {  // 이대로 i 출력하면 1~10까지 모두 출력된다.
			if(i==5) {  // 4까지 찍히고  5를 수행할 때 조건에 부합하지 않아서 break가 걸린다.
				break;
			}
			System.out.println(i);
		}*/
		
		int sum=0;
		int i;  // 지역변수를 초기화 한 중괄호 밖에서 출력하려면 출력 불가, 선언을 중괄호 밖에서 하면 가능
		for(i=1; i<=100; i++) {
			sum+=i;
			if(sum>3500) {  // 합이 3500을 넘으려면 몇까지 더해야 하는가?
				System.out.println("정답=" + i);
				break;
			}
		}  // for문
		
	}

}
