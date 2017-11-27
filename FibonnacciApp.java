import java.util.Scanner;

	public class FibonnacciApp {
		public static void main(String[] args) {
		int Num1 = 0;
		int Num2 = 1;
	Scanner in = new Scanner(System.in);

	System.out.println("How many numbers that you want to get in Fibonacci?");
		int n = in.nextInt();
	System.out.println("Fibonacci numbers ");
	System.out.print(Num1 + " " + Num2 + " " );
	
		int Num3;
	for (int i = 2; i< n; i++) {
		Num3 = Num1 + Num2;

	System.out.print(Num3 + " " );

		Num1 = Num2;
		Num2 = Num3;
		}
	}
}	




