import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        for(int num: arr){ // for every element in the array
            System.out.println(num + " "); // num represent array of the element
        }
//        for (int i = 0; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }


        // array of objects

        String[] str = new String[4];
        for (int i = 0; i< str.length; i++){
            str[i] = in.next();
        }

        str[3] = "Sadique";
        System.out.println(Arrays.toString(str));
    }
}
