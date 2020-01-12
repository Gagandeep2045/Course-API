package io.javabrains.springbootstarter;

public class Singleton {

	private Singleton()
	{}
	
String s;
	static Singleton instanceOfSingleton;
	
	public static Singleton getSingleton()
	{if(instanceOfSingleton==null)
		instanceOfSingleton=new Singleton();
		return instanceOfSingleton;
	}
	
	
}
