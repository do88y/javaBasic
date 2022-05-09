package JavaBase;

public class ForEx3 {

	public static void main(String[] args) {
		/*System.out.println("로또 자동 번호 생성기");
		for(int i=1; i<=6; i++) {
			int num=(int)(Math.random()*45)+1;  // 난수 발생(0~1까지의 숫자 중에 랜덤으로 발생)
			System.out.println(num);
		}*/
		
		System.out.println("로또 자동 번호 생성기");
		int[] lotto=new int[6];
		boolean run=true;
		while(run) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;  // 난수 발생(0~1까지의 숫자 중에 랜덤으로 발생)
			}
			run=false;
			for(int a=0; a<lotto.length-1; a++) {  // 하나씩 비교하기 때문에 4번만 비교하면 됨.
				for(int b=a+1; b<lotto.length; b++) {
					if(lotto[a] == lotto[b]) {  // 처음엔 a에 0, b에 1이 들어간다. 둘을 비교
						run=true;
					}
				}
			}
		}  // while문
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
			
}
