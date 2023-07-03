package gfgDSA.mathematics;

import java.util.Scanner;

public class CountTheDigits {
    private static int count(int n){
        int c=0;
                while(n>0){
                    c++;
                    n=n/10;
                }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        System.out.println("Number of digits in "+n+ " are: "+count(n));
    }
}
