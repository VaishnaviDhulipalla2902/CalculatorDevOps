package calculator;
import java.util.*;
public class App {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("------------Calculator--------------");


		while(true){
      int num1,num2;
      System.out.println("Enter two numbers");
      num1 = scan.nextInt();
      num2 = scan.nextInt();
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to subtract");
			System.out.println("Enter 3 to multiply");
			System.out.println("Enter 4 to divide");

			System.out.println("Enter 5 to exit");

			System.out.println();
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
			add(num1,num2);
			break;
			case 2:
			sub(num1,num2);
			break;
			case 3:
			mul(num1,num2);
			break;
			case 4:
			div(num1,num2);
			break;
			case 9: System.out.println("Exiting calculator....");
			System.exit(0);
			break;
			default: System.out.println("Exiting due to invalid input!!");
			}
		}

	}

	public static int add(int num1,int num2){
		int sum = num1+num2;
		System.out.println("Result is "+sum);
		return sum;
	}

	public static int sub(int num1,int num2){
	      int c = num1-num2;
		  System.out.println("Result is "+(num1-num2));
		  return c;
	  }
	public static int mul(int num1,int num2){
		int c = num1*num2;	
		  System.out.println("Result is "+ (num1*num2));
		  return c;
		}

	  public static int div(int num1,int num2){
		    int c = num1/num2;
			  System.out.println("Result is "+ (num1/num2));
			  return c;
		  }

}