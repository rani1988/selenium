package variableprograms;

public class Var1 {
	int salary1=10000;  //instance variable
	static int salary2=20000;//static variable
	
	public static void login()
	{
		int salary3=30000;
		System.out.println(salary3);//local variable
		
	}
	 public void logout()
	 {
		 int salary4=50000;
		 System.out.println(salary4);
	 }



public static void main(String[]args)
{
	System.out.println(salary2);
	Var1 ref=new Var1();
	System.out.println(ref.salary1);
	login(); //this is static method we can call it directly
	ref.logout();  // logout method is called through the object reference because it is not static variable
	
}
}