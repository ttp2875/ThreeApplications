import java.util.Scanner;

	public class FirstOdds {
		public static void main(String[] args) {
		int sum=0;
	Scanner number=new Scanner(System.in);
		System.out.println("Enter a number");
			int n = number.nextInt();
		System.out.println ("\nThe first odd numbers are :");
	for (int i=1; i<=n; i++)
	{	
		System.out.println (2*i-1);
		sum += 2*i-1;
		}
	System.out.println("The sum of first odd numbers of "+n+" is: " +sum);
		}
	}
