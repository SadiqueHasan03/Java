import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }


    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static void greeting(){
        System.out.println("Hello World");
    }
}
