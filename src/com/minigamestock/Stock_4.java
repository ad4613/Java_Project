package com.minigamestock;

import com.minigameinter.*;

public class Stock_4 extends AllStock{
	
	public Stock_4(String name, int price, int shareHolding, String Variance) {
		setName(name);
		setPrice(price);
		setShareHolding(shareHolding);
		setVariance(Variance);
		dealingBehavior = new Credit();
	}

	@Override
	public void Display() {
		System.out.println("���� : " + getName());
		System.out.println("���簡 : " + getPrice());
	}

}
