import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println("Hello World");
        }

        // while loop
        int num = 1;
        while(num <= n){
            System.out.println("Hello World");
            num++;
        }

        int num1 = 1;
        do {
            System.out.println("Hello World");
            num1++;
        }while(num1 <= n);
    }
}
