package singleton;

public class Singleton {
	
	/**
	 * 私有构造方法
	 */
	private Singleton()
	{
		System.out.println("單例模式");
	}
	
	private static volatile Singleton instance;
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) 
			{
				if(instance == null)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
