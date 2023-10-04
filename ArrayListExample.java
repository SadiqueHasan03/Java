import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(67);
//        list.add(7);
//        list.add(6);
//        list.add(5);
//        list.add(2);
//        list.add(1);
//        list.add(9);
//
//        System.out.println(list);
//        System.out.println(list.contains(2));
//        System.out.println(list.set(0, 99));
//
//        System.out.println(list);

        // Input
        for (int i = 0; i< 5 ; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i< 5 ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
