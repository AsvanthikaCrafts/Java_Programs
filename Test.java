import java.util.*;



public class Test{

	 public static void main(String[] args){

	 System.out.println("hello world: "+args[0]);
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Please enter a value :");
	 
	 int a = in.nextInt();
	 
	 System.out.println("Please enter 2nd value :");
	 
	 int b = in.nextInt();
	 
	 int c = a + b;
	 
	 System.out.println("Sum of values is  : "+c);
	 
	 in.close();
	 
	 
	}
}