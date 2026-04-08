//Given an integer x, return true if x is a palindrome, and false otherwise.
import java.util.*;
public class Day_01 {
    public static void main(String[] args) {
        int x = 121; // Example input
        if(x<0) {
            System.out.println(false);
            return;
        }
        int n = x;
        int rev = 0;
        while(n>0) {
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n /= 10;
        }
        if (rev == x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}