package Creational;

import java.util.ArrayList;
import java.util.List;

import FacotryMethod.Factory;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owner.add(((IDCard)p).getOwner());
		
	}
	
		
		
}
