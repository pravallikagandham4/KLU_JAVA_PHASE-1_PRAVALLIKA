import java.util.*;

public class SpecificDC {
    public static void main(String[] args) {
        int count = digitCount();
        System.out.println("Digit count = " + count);
    }

    static int digitCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long n = sc.nextLong();
        System.out.println("Enter the digit to count: ");
        int d = sc.nextInt();

        int count = 0;
        while (n != 0) {
            int rem = (int)(n % 10);
            if (rem == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
