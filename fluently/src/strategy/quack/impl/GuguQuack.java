package strategy.quack.impl;

import strategy.quack.IQuack;

public class GuguQuack implements IQuack {

	@Override
	public void quack() 
	{
		System.out.println("I can Gugu Quack!");
	}

}
