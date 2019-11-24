package day1.classroom;

public class Mobile {
	public long makeCall()
	{
		System.out.println("Number");
		return 99433;
	}
	public void sendSMS()
	{
		System.out.println("Cal u later");
	}
	public String shutDown()
	{
		return "Mobile Shutdown";
	}
public static void main(String[] args) {
	//syntax to call a class
	//class-name object = new class-name();
	Mobile mob=new Mobile();
	long makeCall = mob.makeCall();
	System.out.println(makeCall);
	//syntax to call a method
	//object.method-name();
		mob.sendSMS();
		//syntax to show return value
		//variable-type method-name = object.methd-name
	String shutDown = mob.shutDown();
	System.out.println(shutDown);
}
}
