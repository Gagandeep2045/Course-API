package io.javabrains.springbootstarter;

public class SingletonDemo {

	
	public static void main(String args[])
	{
		Singleton instanceOfSingleton1 = Singleton.getSingleton();
		instanceOfSingleton1.s="hello";
		
		
		Singleton instanceOfSingleton2 = Singleton.getSingleton();
		instanceOfSingleton2.s="hi";
		
		System.out.println(instanceOfSingleton1.hashCode()+"  "+instanceOfSingleton2.hashCode());
		System.out.println(instanceOfSingleton1.s+" "+instanceOfSingleton2.s);
	}
	
}


/* 
  1.In object-oriented programming, a singleton class is a class that can have only 
  one object (an instance of the class) at a time.
 
 2.An implementation of singleton class should have following properties:
 a.It should have only one instance: This is done by providing instance of class from within the class. Outer classes or 
 subclasses should be prevented to create the instance.This is done by making the constructor private in java 
 so that no class can access the constructor and hence cannot instantiate it.
 b.Instance should be globally accessible
 
 
 */








