package gfgDSA.mathematics;

import java.util.Scanner;

public class NonRecursiveFactorialOfTheNumber {
    private static int nonRecursiveFactorial(int n){
        int f=1,i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        return f;
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
            System.out.println("Factorial of "+ n +" is: "+ nonRecursiveFactorial(n));
    }
}
