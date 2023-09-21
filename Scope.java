import java.util.Enumeration;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//                int a = 78;
        }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
