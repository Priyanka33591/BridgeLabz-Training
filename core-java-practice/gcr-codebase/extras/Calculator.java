import java.util.*;

public class Calculator {
    static double add(double a, double b){ return a+b; }
    static double sub(double a, double b){ return a-b; }
    static double mul(double a, double b){ return a*b; }
    static double div(double a, double b){ return b!=0 ? a/b : Double.NaN; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        System.out.println("Choose Operation: +  -  *  /");
        char op=sc.next().charAt(0);

        switch(op){
            case '+': System.out.println(add(a,b)); break;
            case '-': System.out.println(sub(a,b)); break;
            case '*': System.out.println(mul(a,b)); break;
            case '/': System.out.println(div(a,b)); break;
            default: System.out.println("Invalid Operation!");
        }
        sc.close();
    }
}
