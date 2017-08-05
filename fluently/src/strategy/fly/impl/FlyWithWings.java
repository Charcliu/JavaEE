package strategy.fly.impl;

import strategy.fly.IFly;

public class FlyWithWings implements IFly {

	@Override
	public void fly()
	{
		System.out.println("I can Fly!");
	}

}
