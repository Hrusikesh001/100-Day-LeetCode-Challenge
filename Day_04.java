// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.


// public class Day_04 {
//     public static void main(String[] args) {
//         int n = 5; 
//         if(n == 0) {
//             System.out.println(0);
//             return;
//         }else if(n == 1 || n == 2) {
//             System.out.println(1);
//             return;
//         }else {
//             int firstTerm = 0;
//             int secondTerm = 1;
//             int thirdTerm = 1;

//             for(int i = 1; i <= n; i++) {
//                 int fourthTerm = firstTerm + secondTerm + thirdTerm;
//                 firstTerm = secondTerm;
//                 secondTerm = thirdTerm;
//                 thirdTerm = fourthTerm;
//             }
//             System.out.println(firstTerm);
//         }

//     }
// }


public class Day_04 {

    // LeetCode-style function
    public static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int a = 0, b = 1, c = 1;

        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return c;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonacci(n)); // Output: 7
    }
}