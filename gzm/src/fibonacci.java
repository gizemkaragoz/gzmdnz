import java.util.*;
public class fibonacci {
	

    public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);
    	System.out.println("enter number ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.print(i + ": " + fib(i));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}
