package variableprograms;

public class Demo1 {
	public void Rank() {
		int rank = 0;  //local variable to access this variable we need to crete an instance obj
		rank = rank + 7;
		System.out.println("Rank = " + rank);
	}

	public static void main(String args[]) {
		Demo1 d = new Demo1();  // create an obj to access instance variables and local variables
		d.Rank();
	}
}
