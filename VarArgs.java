import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,8,9);
        multiple(1,34, "Sadique", "Raiyan" , "Shayal");
//        demo(2,3,4);
//        demo("Sadique", "Raiyan");
//        demo();    // It will give error because of ambiguity
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){     //  variable argument can not come in the middle

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
