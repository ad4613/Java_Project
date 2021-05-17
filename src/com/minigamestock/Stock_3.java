package com.minigamestock;

import com.minigameinter.*;

public class Stock_3 extends AllStock {

	public Stock_3(String name, int price, int shareHolding, String Variance) {
		setName(name);
		setPrice(price);
		setShareHolding(shareHolding);
		setVariance(Variance);
		dealingBehavior = new Cash();
	}

	@Override
	public void Display() {
		System.out.println("���� : " + getName());
		System.out.println("���簡 : " + getPrice());
	}

}
