import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        int x, y;
        System.out.println("Please, insert two integers: ");
        Scanner in = new Scanner (System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Please, insert an operator ('+', '-', '*', '/'): ");
        char c = in.next().charAt(0);

        switch(c)
        {
            case '+': System.out.println("The sum of two integers is:" + (x+y));
                break;
            case '-': System.out.println("The sub of two integers is:" + (x-y));
                break;
            case '*': System.out.println("The product of two integers is:" + (x*y));
                break;
            case '/': System.out.println("The division of two integers is:" + (x/y));
                break;
            default: System.out.println("Try again!");
        }
    }
}
