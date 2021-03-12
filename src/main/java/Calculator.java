import java.util.*;
public class Calculator {
    public static void main(String args[]){
        double num1, num2;
        int op;
        int flag = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator Application");

        do{
            System.out.println("Choose the Operation");
            System.out.println("");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit the Application");
            System.out.println("Enter your choice(number): ");
            op = reader.nextInt();
            if(op == 5) flag = 1;
            else{
                switch(op){
                    case 1:
                        System.out.println("You choose Addition!");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextDouble();
                        System.out.println("The result is: " + (num1+num2));
                        break;
                    case 2:
                        System.out.println("You choose Subtraction!");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextDouble();
                        System.out.println("The result is: " + (num1-num2));
                        break;
                    case 3:
                        System.out.println("You choose Multiplication!");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextDouble();
                        System.out.println("The Result is: " + (num1*num2));
                        break;
                    case 4:
                        System.out.println("You choose Division!");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextDouble();
                        System.out.println("The Result is: " + (num1/num2));
                        break;
                    default :
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        }while(flag==0);
    }
}
