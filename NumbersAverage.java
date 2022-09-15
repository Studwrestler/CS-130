package lab3;
import java.util.Scanner;
public class NumbersAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer number: ");
		int number1=scan.nextInt();
		System.out.println("Enter the second integer number: ");
		int number2 = scan.nextInt();
		System.out.println("Enter the third integer number: ");
		int number3 = scan.nextInt();
		System.out.println("You entered "+ number1 + ", "+ number2+ ", "+number3 );
		int average = (number1+number2+number3)/3;
		System.out.println("The average is "+ average);

	}

}
