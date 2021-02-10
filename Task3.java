package part1;

public class Task3 {
	public static void main(String[] args) {
	   	 
	   	 System.out.print(Recursive2pow(5));
	   	 System.out.println();
	   	 System.out.print(Iterative2pow(2, 5));
	}
	public static int Recursive2pow(int n) {
		if (n==0) {
			return 1;
		}
		return 2*Recursive2pow(n-1);
		
	}
	public static int Iterative2pow(int osnova, int stepen) {
		int izhod=1;
		while(stepen>0) {
			izhod*=osnova;
			stepen--;
		}
		return izhod;
	}

}
