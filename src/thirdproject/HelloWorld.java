package thirdproject;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		int var1,var2,var3;		
		
		var1=5;
		var2=10;
		var3=addNumbers(var1, var2);
		
		
		System.out.println("I love Mahesh"+var3);
		// TODO Auto-generated method stub
		
		

	}
	public static int addNumbers (int value1,int value2)
	{
		value1=value1+10;
		value2=value2+10;
		
		return value1+value2;
	}

}
