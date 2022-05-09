package JavaBase;

public class ConfirmEx2 {

	public static void main(String[] args) {
		/*int dice1=0;
		int dice2=0;  // 처음에 while문 안으로 들어가게 하기 위해 변수 값을 0으로 설정
		while(dice1+dice2 != 5) {
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}*/
		int dice1;
		int dice2;
		while(true) {
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if(dice1+dice2 == 5) {
				break;
			}
		}

	}

}
