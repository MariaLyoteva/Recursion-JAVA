package part4;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int list []=  {1,2,3,4};
        System.out.println(average(list, 4));
        }
	
	 public static double average(int[] arr, int n) {
	    return sum( arr, n, 0)/n;
	    }
	
    public static double sum(int[] arr, int n, int result ) {
    	if (n==0) {
    		return result;
    	} else {
    		return sum(arr, n-1, result+ arr[n-1]);
    	}
    }

}
