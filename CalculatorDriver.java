package practiceProjects;

import java.util.Scanner;

public class CalculatorDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("--------------> Demo of an Arithmetic Calculator <--------------");
		int choice;
		
		do {
			System.out.println("\n\nSelect the type of opperation:");
			System.out.println("0-Exit\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n");
			
			choice = input.nextInt();
			
			if (choice == 0) {
				System.out.println("Thanks for using my arithmetic calculator!");
				break;
			}
			
			System.out.println("\nEnter the first number");
			double fNum = input.nextDouble();
			
			System.out.println("Enter the second number");
			double sNum = input.nextDouble();
			
			
			
			switch(choice) {
			case 1:
				System.out.println("\nAddition");
				System.out.printf("%.2f + %.2f = %.2f\n", fNum, sNum, ArithmeticCalculator.addition(fNum, sNum));
				break;
				
			case 2:
				System.out.println("\nSubtraction");
				System.out.printf("%.2f - %.2f = %.2f\n", fNum, sNum, ArithmeticCalculator.subtraction(fNum, sNum));
				break;
			case 3:
				System.out.println("\nMultiplication");
				System.out.printf("%.2f * %.2f = %.2f\n", fNum, sNum, ArithmeticCalculator.multiplication(fNum, sNum));
				break;
			case 4:
				try {
					System.out.println("\nDivision");
					System.out.printf("%.2f + %.2f = %.2f\n", fNum, sNum, ArithmeticCalculator.division(fNum, sNum));
				}catch(ArithmeticException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Thanks for using my arithmetic calculator!");
				
			}
			
		}while(choice != 0);
		
		
	}
}
