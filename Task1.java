package part2;

public class Task1 {
	public static void main(String[] args) {
	  //	 System.out.println(evenR(30));
	  	 System.out.println(oddR(31));
	}
	
	public static boolean evenR(int n) {
		if(n==0) {
			return true;
		}
		else if(n==1){
			return false;
		}
		
		return evenR(n-2);
	}
	
	public static boolean oddR(int n) {
		if(n==0) {
			return false;
		}
		else if(n==1){
			return true;
		}
		
		return oddR(n-2);
	}
}
