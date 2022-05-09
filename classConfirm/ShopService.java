package classConfirm;

public class ShopService {
	
	private static ShopService shopsc=new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {  // 사용할 수 있게 하기 위해서 만든 메소드
		return shopsc;
	}
	
}
