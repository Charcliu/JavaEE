package strategy.duck.impl;

import strategy.duck.Duck;
import strategy.fly.impl.FlyWithWings;
import strategy.quack.impl.GuaguaQuack;

public class RedHeadQuack extends Duck {

	public RedHeadQuack() {
		this.ifly = new FlyWithWings();
		this.iQuack = new GuaguaQuack();
	}
}
