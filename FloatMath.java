package lab3;
import java.util.Scanner;
public class FloatMath {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first floating point number: ");
		float number1=scan.nextFloat();
		System.out.println("Enter the second floating point number: ");
		float number2=scan.nextFloat();
		
		number1+=number2;
		System.out.println("The sum is "+number1);
		number1-=number2;
		System.out.println("The difference is "+number1);
		number1*=number2;
		System.out.println("The product is "+number1);

	}

}
