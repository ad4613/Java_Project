package com.minigameinter;

public class Cash implements DealingBehavior {
	
	@Override
	public void dealing() {  
		System.out.println("현금거래가능");
	}
	
}