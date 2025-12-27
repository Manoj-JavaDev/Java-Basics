package NumberGuessing;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range of numbers to generate:");
		System.out.println("Enter starting range:");
		
		int start = sc.nextInt();
		System.out.println("Enter Ending Range");
		int end = sc.nextInt();
		
		int range = end  - start + 1;
		
		System.out.println("Enter Maximum Attempts to guess !!!!");
		int maxAttempts = sc.nextInt();
		int target = (int)(Math.random() * range) + start;
		for(int i = 1;i <= maxAttempts;i++)
		{
			System.out.println("Enter Your Correct Guess:");
			int guess = sc.nextInt();
			if(guess > target)
			{
				System.out.println("Guessed number is too large !! and you have just " + (maxAttempts - i) +" Attempts");
			}
			else if(guess < target)
			{
				System.out.println("Guessed Number is smaller than target !! and you have just " + (maxAttempts - i) + " Attempts");
			}
			else
			{
				System.out.println("Brilliant you guessed Correctly !!");
				System.out.println("that's Exactly " + guess);
				break;
			}
		}
		
		sc.close();
	}
}
