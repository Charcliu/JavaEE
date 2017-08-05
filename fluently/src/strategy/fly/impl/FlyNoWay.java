package strategy.fly.impl;

import strategy.fly.IFly;

public class FlyNoWay implements IFly {

	@Override
	public void fly() 
	{
		System.out.println("I can't fly!");
	}

}
