package FacotryMethod;
// Factory Method ����: ��ü�� ����� �κ��� ���� Ŭ������ �����ϴ� ����
// IDCard Ŭ������ Sub Class�� IDCardFactory Ŭ������ Ȱ���Ͽ� IDCard�� ��ü�� �����Ѵ�.
// �θ� �߻� Ŭ������ �����ϰ� ������ ����Ŭ������ �����ڷ� ����
// �ź���(IDCard)�� ����� ����(IDCardFactory)�� Ȱ��
// �߻�ü�� Factory Ŭ����, Product Ŭ����

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
