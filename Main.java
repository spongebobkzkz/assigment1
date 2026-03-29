import java.util.Scanner;

public class Main {

    // O(n): recursive sum of squares from 1 to n
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

    // O(n): recursive sum of first n elements of an array
    public static int sumFirstNElements(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + sumFirstNElements(arr, n - 1);
    }

    // O(n): recursive sum of powers b^0 + b^1 + ... + b^n
    public static long sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (long) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    // O(n): recursive reverse output of sequence without arrays and loops
    public static void printReverse(Scanner sc, int n) {
        if (n == 0) {
            return;
        }
        int x = sc.nextInt();
        printReverse(sc, n - 1);
        System.out.print(x);
        if (n > 1) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        int n1 = sc.nextInt();
        System.out.println(sumOfSquares(n1));

        // Task 2
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        readArray(sc, arr, 0); // recursive input
        System.out.println(sumFirstNElements(arr, n2));

        // Task 3
        int b = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(sumOfPowers(b, n3));

        // Task 4
        int n4 = sc.nextInt();
        printReverse(sc, n4);
    }

    // O(n): recursive array input
    public static void readArray(Scanner sc, int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        readArray(sc, arr, index + 1);
    }
}
