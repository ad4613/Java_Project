package com.minigamestock;

import com.minigameinter.DealingBehavior;
import lombok.Data;

@Data
public abstract class AllStock {
	
	DealingBehavior dealingBehavior;
	private String name; // 각각 종목이 가지게 되는 이름
	private int price; // 각각 종목이 가지고 있는 현재가
	private int shareHolding; // 각각 종목이 가지고 있는 주식 수
	private String variance;
	public static int seed = 1000000;
	public static int stockValue = 0;
	
	abstract void Display();
	
	
}

