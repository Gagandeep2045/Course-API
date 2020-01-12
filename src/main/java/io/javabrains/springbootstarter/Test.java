package io.javabrains.springbootstarter;

public class Test {
	static int s;
	static{
		
		
		System.out.println(s +" static ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(s +"main");
	}

static void p()
{
	s=s+1;
}

}

