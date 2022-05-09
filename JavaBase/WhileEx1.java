package JavaBase;

public class WhileEx1 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;  // for문과는 달리 이 작업을 빼먹으면 무한루프 돌 수 있다(1이 끝없이 찍힘)
		}

	}

}
