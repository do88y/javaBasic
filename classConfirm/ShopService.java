package classConfirm;

public class ShopService {
	
	private static ShopService shopsc=new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {  // ����� �� �ְ� �ϱ� ���ؼ� ���� �޼ҵ�
		return shopsc;
	}
	
}
