package gfgDSA.mathematics;

import java.util.Scanner;

public class PalindromeNumber {
    private static int reverse(int n){
        int r=0;
                while(n>0){
                    int lastDigit = n %10;
                    r = r * 10 + lastDigit;
                    n=n/10;
                }
                return r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scanner.nextInt();
        int reverse = reverse(n);
        if(n == reverse)
            System.out.println("Yes "+ n + " is palindrome number.");
        else
            System.out.println("No "+ n + " is not a palindrome number.");
    }
}
