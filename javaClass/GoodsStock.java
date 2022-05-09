package javaClass;
// account랑 비슷한 클래스 만들기
public class GoodsStock {

	String goodsCode;
	int stockNum;
	
	void addStock(int amount) {
		stockNum+=amount;
	}
		
		int subtractStock(int amount) {
			if(stockNum < amount) {
				return 0;
		}
		stockNum-=amount;
				return amount;
	}
	
}
