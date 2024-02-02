public class SE_LAB03 {

    public static int seqnum(long n) {
        int i = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        long n = 22;
        System.out.println("The number n = " + n + ":");
        /*while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);*/

        int cycleLength = seqnum(n);
        System.out.println("Cycle length for n = " + n + " is " + cycleLength);
    }
}
