package dem;

public class Sum {
	public static int addition(int x,int y) {
		int z = x+y;
		return z;
	}
	public static void main(String[] args) {
	    
	    System.out.println("Enter two numbers");
	    int a  = 12;
	    int b = 5;
	    int sum= 0;
	    sum= addition(a,b);
	    int d = 30;
	    int e = 0;
	    e = sum+d;
	    
	    System.out.println("The sum is:"+ sum);
	  }

}
