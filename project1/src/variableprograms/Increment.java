package variableprograms;

public class Increment {
	public void account(int balance, int withdrawamt) {
		if (balance > withdrawamt) {
			System.out.println("withdraw successfully");
		} else {
			System.out.println("not sufficient balance");
		}

	}

	public static void main(String[] args) {
		Increment user = new Increment();
		user.account(1000, 9000);
	}
}