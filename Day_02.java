// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

public class Day_02 {
    public static void main(String[] args) {
        int n = 16;
        if(n<1) {
            System.out.println(false);
        }else if(n==1) {
            System.out.println(true);
        }else {
            while (n%2==0) {
                n /= 2;
            }
            if(n==1) {
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
