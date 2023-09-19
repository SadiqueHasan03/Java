import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting
        int height = (int)(37.37f);
        System.out.println(height);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);  // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/ c;

//        int number = 'A';
//
//        System.out.println("بھارت");
//
//        System.out.println(4 + 23.4);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //       float + int - double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
