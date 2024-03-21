package FacotryMethod;
// Factory Method 패턴: 객체를 만드는 부분을 서브 클래스에 위임하는 패턴
// IDCard 클래스의 Sub Class인 IDCardFactory 클래스를 활용하여 IDCard의 객체를 생성한다.
// 부모 추상 클래스로 선언하고 생성은 서브클래스의 생성자로 생성
// 신분증(IDCard)를 만드는 공장(IDCardFactory)을 활용
// 추상체로 Factory 클래스, Product 클래스

import Creational.IDCardFactory;
import Creational.Product;

public class FactoryMethodPattern {
	public static void main(String[] args) {
			Factory factory = new IDCardFactory();
			Product card1 = factory.create("wkddlsqja");
			Product card2 = factory.create("wkddlsqja");
			card1.use();
			card2.use();
	
	}

}
