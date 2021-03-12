package calculator;
import java.util.*;
public class App {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("------------Calculator--------------");


		while(true){
      int a,b;
      System.out.println("Enter two numbers");
      a = scan.nextInt();
      b = scan.nextInt();
			System.out.println("Press 1 to add");
			System.out.println("Press 2 to subtract");
			System.out.println("Press 3 to multiply");
			System.out.println("Press 4 to divide");

			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
			add(a,b);
			break;
			case 2:
			sub(a,b);
			break;
			case 3:
			mul(a,b);
			break;
			case 4:
			div(a,b);
			break;
			case 9: System.out.println("Exiting calculator");
			System.exit(0);
			break;
			default: System.out.println("Incorrect choice!!");
			}
		}

	}

	public static int add(int a,int b){
		int sum = a+b;
		System.out.println("Result is "+sum);
		return sum;
	}

	public static int sub(int a,int b){
	      int c = a-b;
		  System.out.println("Result is "+(a-b));
		  return c;
	  }
	public static int mul(int a,int b){
		int c = a*b;	
		  System.out.println("Result is "+ (a*b));
		  return c;
		}

	  public static int div(int a,int b){
		    int c = a/b;
			  System.out.println("Result is "+ (a/b));
			  return c;
		  }

}