import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long m = scanner.nextLong();

        long f = 1;
        int i = 1;
        while (f <= m) {
            i++;
            f *= i;
        }
        System.out.println(i);
    }
}