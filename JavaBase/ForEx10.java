package JavaBase;

public class ForEx10 {

	public static void main(String[] args) {
		int sum;
		for(int ost=1; ost<=16; ost++) {
			for(int pig=1; pig<=16; pig++) {
				sum=ost*2+pig*4;  // 타조와 돼지의 다리 갯수
				if(sum==56 && ost+pig==17)  // 둘 다 만족할 때 출력
					System.out.println("돼지 " + pig + "마리, 타조 " + ost + "마리");
			}
		}

	}

}
