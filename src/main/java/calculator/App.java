package calculator;
import java.util.*;
public class App {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int op, flag=0;
		int num1, num2;
		System.out.println("------------Calculator--------------");
		do{
			System.out.println("Choices of Operations:");
            System.out.println("");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
			System.out.println("");
            System.out.print("Enter your choice(number): ");
			System.out.println("");
			op = reader.nextInt();
			if(op==5) flag = 1;
			else{				
				switch(op){
					
					case 1:  // Addition
						System.out.println("You choose Addition!!");
						System.out.println("");
						System.out.print("Enter number 1: ");
						num1 = reader.nextDouble();
						System.out.print("Enter number 2: ");
						num2 = reader.nextDouble();
						add(num1,num2);
					break;

					case 2: //Subtraction
						System.out.println("You choose Subtraction!!");
						System.out.println("");
						System.out.print("Enter number 1: ");
						num1 = reader.nextDouble();
						System.out.print("Enter number 2: ");
						num2 = reader.nextDouble();
						sub(num1,num2);
					break;

					case 3: //Multiplication
						System.out.println("You choose Multiplication!!");				
						System.out.println("");
						System.out.print("Enter number 1: ");
						num1 = reader.nextDouble();
						System.out.print("Enter number 2: ");
						num2 = reader.nextDouble();
						mul(num1,num2);
					break;

					case 4: //Division
						System.out.println("You choose Division!!");
						System.out.println("");
						System.out.print("Enter number 1: ");
						num1 = reader.nextDouble();
						System.out.print("Enter number 2: ");
						num2 = reader.nextDouble();
						div(num1,num2);
					break;

					default: 
						System.out.println("Exiting due to invalid input!!");
						flag = 1;
					}
				}		
		    }while(flag == 0);
		}

	public static int add(int num1,int num2){
		int c = num1+num2;
		System.out.println("");
		System.out.println("The Result is "+c);
		System.out.println("");
		return c;
	}

	public static int sub(int num1,int num2){
	    int c = num1-num2;
		System.out.println("");
		System.out.println("The Result is "+(num1-num2));
		System.out.println("");
		return c;
	}
	public static int mul(int num1,int num2){
		int c = num1*num2;	
		System.out.println("");
		System.out.println("The Result is "+ (num1*num2));
		System.out.println("");
		return c;
	}
	  public static int div(int num1,int num2){
		int c = num1/num2;
		System.out.println("");
		System.out.println("The Result is "+ (num1/num2));
		System.out.println("");
		return c;
	}

}