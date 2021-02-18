package part4;

import java.util.Scanner;

public class Task2 {
	public static int stepenuvaneI(int osnova, int stepen) {
		int izhod=1;
		while(stepen>0) {
			izhod*=osnova;
			stepen--;
		}
		return izhod;
	}
	
	
	public static int stepenuvaneR(int osnova, int stepen) {
		return stepenuvaneR(osnova, stepen, 1);
	}
	
	public static int stepenuvaneR(int osnova, int stepen, int result) {
		if (stepen == 0) {
			return result;
	   	} else {
	   		return  stepenuvaneR(osnova, stepen - 1, result*osnova);
	   	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a base and a power : ");
		Scanner reader = new Scanner(System.in);
		int base = reader.nextInt();
		int power = reader.nextInt();
		System.out.print("Result is " +  stepenuvaneI(base,power));
		System.out.println(" - itterative");
		System.out.print("Result is " +  stepenuvaneR(base,power));
		System.out.println(" - recursive ");
		
	}

}
