import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		double a,b,c,z=0;
		int d=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the amount to be saved for each month: ");
		a = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		b=input.nextDouble();
		System.out.print("Enter the number of months: ");
		c=input.nextDouble();
		double b1=b/100;
		do { z=(z+a)*(1+(b1/12.0));
		d++; }
		while (d!=c);
		System.out.print("After the " +(int)c+"th mounth, the account value is "+z);}}
