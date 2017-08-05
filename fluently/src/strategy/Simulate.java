package strategy;

import strategy.duck.Duck;
import strategy.duck.impl.RedHeadQuack;

public class Simulate {

	public static void main(String[] args)
	{
		Duck myDuck = new RedHeadQuack();
		
		if(myDuck.getClass() == Duck.class)
		{
			myDuck.display();
			System.out.println("myDuck.getClass() == Duck.class");
		}
		else if(myDuck.getClass() == RedHeadQuack.class)
		{
			myDuck.display();
			System.out.println("myDuck.getClass() == RedHeadQuack.class");
		}
		else if(myDuck instanceof Duck)
		{
			myDuck.display();
			System.out.println("myDuck instanceof Duck");
		}
		else if(myDuck instanceof RedHeadQuack)
		{
			myDuck.display();
			System.out.println("myDuck instanceof RedHeadQuack");
		}
	}

}
