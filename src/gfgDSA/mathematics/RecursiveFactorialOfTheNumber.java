package gfgDSA.mathematics;

import java.util.Scanner;

public class RecursiveFactorialOfTheNumber {
    private static int recusiveFactorial(int n){
        if(n==1)
            return 1;
        return n*recusiveFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n= scanner.nextInt();
        if(n==0)
            System.out.println("Factorial of "+ n +" is 1.");
        else if (n<0) {
            System.out.println("Factorial cannot be calculated, because "+ n + " is negative.");
        } else
            System.out.println("Factorial of "+ n +" is: "+ recusiveFactorial(n));
    }
}
