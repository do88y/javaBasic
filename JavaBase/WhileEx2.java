package JavaBase;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.print("행운 주사위 번호 입력>>");
			int myNum=sc.nextInt();
			int count=0;
			int comNum;  // 이거를 while문 밖에 따로 선언해야 함
			if(myNum<=6 && myNum>=1) {
				while(true) {
					count++;
					comNum=(int)(Math.random()*6)+1;
					System.out.println(comNum);  // 이걸 빠뜨림
					if(myNum==comNum) {
						run=false;
						break;  // 여기까진 맞음
					}
				}//while문->이걸 밑에다가 했는데 break 하고 바로 while 닫아야 함
					if(count<=6) {
						System.out.println("그래도 확률이 살아있네요");
					}else {
						System.out.println("확률이 바닥이군요");
					}
			}else {
				System.out.println("주사위 번호는 1부터 6사이이의 숫자입니다.");
				System.out.println("다시 입력해보세요.");
			}
		}
			
	}

}