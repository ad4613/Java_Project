package com.minigamestock;

import com.minigameinter.DealingBehavior;
import lombok.Data;

@Data
public abstract class AllStock {
	
	DealingBehavior dealingBehavior;
	private String name; // ���� ������ ������ �Ǵ� �̸�
	private int price; // ���� ������ ������ �ִ� ���簡
	private int shareHolding; // ���� ������ ������ �ִ� �ֽ� ��
	private String variance;
	public static int seed = 1000000;
	public static int stockValue = 0;
	
	abstract void Display();
	
	
}

