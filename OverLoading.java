public class OverLoading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Sadique Hasan");
       int ans = sum(3, 4);
        System.out.println(ans);
    }

    static int sum(int a , int b){
        return a + b;
    }

    static int sum(int a , int b , int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println("First one");
    }

    static void fun(String name){
        System.out.println("Second one");

    }
}
