import java.util.Scanner;

public class Main {

    // Task 1 – O(n)
    public static int sumOfSquares(int n) {
        if (n == 0) return 0;
        return n * n + sumOfSquares(n - 1);
    }

    // Task 2 – O(n)
    public static int sumFirstNElements(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumFirstNElements(arr, n - 1);
    }

    // Массивті рекурсивті оқу – O(n)
    public static void readArray(Scanner sc, int[] arr, int i) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        readArray(sc, arr, i + 1);
    }

    // Task 3 – O(n)
    public static long sumOfPowers(int b, int n) {
        if (n == 0) return 1;
        return (long) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    // Task 4 – O(n), массив те, цикл де жоқ
    public static void printReverse(Scanner sc, int n) {
        if (n == 0) return;
        int x = sc.nextInt();
        printReverse(sc, n - 1);
        System.out.print(x);
        if (n > 1) System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        System.out.println(sumOfSquares(n1));

        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        readArray(sc, arr, 0);
        System.out.println(sumFirstNElements(arr, n2));

        int b = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(sumOfPowers(b, n3));

        int n4 = sc.nextInt();
        printReverse(sc, n4);

        sc.close();
    }
}
