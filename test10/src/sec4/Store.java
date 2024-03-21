package sec4;
// extends로 다중 상속을 받을 수 없음.
// Pay 클래스에서 public class Pay extes Inventory { }
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("지불하기");
		super.pay();
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
	

}
