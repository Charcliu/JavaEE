package strategy.duck;

import strategy.fly.IFly;
import strategy.quack.IQuack;

public class Duck {
	public IFly ifly;
	public IQuack iQuack;
	
	public void display()
	{
		ifly.fly();
		iQuack.quack();
	}
}
