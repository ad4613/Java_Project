package com.minigamestock;

import com.minigameinter.*;

public class Stock_1 extends AllStock {

	public Stock_1(String name, int price, int shareHolding,String Variance) { 
		setName(name);
		setPrice(price);
		setShareHolding(shareHolding);
		setVariance(Variance);
		dealingBehavior = new Cash();
		dealingBehavior = new Credit();
	}

	@Override
	public void Display() { 
		System.out.println("종목 : " + getName());
		System.out.println("현재가 : " + getPrice());
	}

}