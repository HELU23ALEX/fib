import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("inter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int i;
        int fib = 0;

        for (i = 1; i <= n; i++) {
            System.out.println(f);
            fib = f + s;
            f = s;
            s = fib;
        }


    }
}