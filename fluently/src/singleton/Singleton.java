package singleton;

public class Singleton {
	
	/**
	 * ˽�й��췽��
	 */
	private Singleton()
	{
		System.out.println("����ģʽ");
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
