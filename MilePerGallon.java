package lab3;
import java.util.Scanner;
public class MilePerGallon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of miles driven: ");
		double number1=scan.nextDouble();
		System.out.println("Enter the number of gallons in the tank: ");
		double number2 = scan.nextDouble();
		
		double division = number1/number2;
		System.out.println("The MPG is "+ division);

	}

}
