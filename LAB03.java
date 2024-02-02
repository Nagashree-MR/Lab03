import java.util.Scanner;

public class LAB03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        CycleLength(n);

    }

    public static int CycleLength(int n) {
        int cycleLength = 1;

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            cycleLength++;
        }

        System.out.println(n);
        System.out.println("Cycle length is " + cycleLength);
        return cycleLength;
    }
}