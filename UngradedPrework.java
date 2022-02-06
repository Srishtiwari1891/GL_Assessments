package prework5Feb;

import java.util.Scanner;
import java.lang.Math;

public class UngradedPrework {

	public static void main(String[] args) {
		int x,n;
		Scanner sc = new Scanner (System.in);
		do {
		System.out.println("1....Check Palindrome Number\n"
				+ "2....Print Star Pattern\n"
				+ "3....Check Prime Number\n"
				+ "4....Print Fibonacci Series\n"
				+ "\nSelect one operation : ");
		n=sc.nextInt();
		System.out.println("Enter input for the selected operation: ");
		x=sc.nextInt();
		switch(n) {
		case 1:
				checkPalindrome(x);
				break;
		
		case 2:
				printStarPattern(x);
				break;
		case 3:
				checkPrime(x);
				break;
		
		case 4:
				printFibonacci(x);				
				break;
				
		default: 
				n=5;
				break;
		}
		break;
		}while(n!=5);
		sc.close();
	}

	private static void printFibonacci(int x) {
		int i=0,j=1,sum;
		System.out.print(i+" "+j+" ");
		for(int a=1;a<=x-2;a++) {
			sum=i+j;
			System.out.print(sum+" ");
			i=j;
			j=sum;
		}
	}

	private static void checkPrime(int x) {
		int cnt=0;
		for(int i=2;i<x;i++)
			if(x%i==0){
				cnt++;
				break;
			}				
		if(cnt>0)
			System.out.println("Input number "+x+" is not a Prime Number");
		else
			System.out.println("Input number "+x+" is a Prime Number");
	}

	private static void printStarPattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=x;j>=i;j--)
				System.out.print("*");
			System.out.println();
		}
	}

	private static void checkPalindrome(int x) {
		// TODO Auto-generated method stub
		int cnt=0,y=0,z=x;
		while(z%10!=0) {
			z=z/10;
			cnt++;
		}
		z=x;
		for(int i=cnt;i>1;i--) {
			y+=((x%10)*(Math.pow(10,(i-1))));
			x=x/10;
		}
		y+=x;
		if(z==y)
			System.out.println("Input Number "+z+" is Palindrome");
		else
			System.out.println("Input Number "+z+" is not Palindrome");
	}

}
