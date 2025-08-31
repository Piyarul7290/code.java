import java.util.Scanner;
public class Stringexmple {
    public static void main(String[] args) {
        // 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
        String presonalised = myGreet("piyarul sekh");
        System.out.println(presonalised);

    }
    static String myGreet(String name){
        String message = "Hello "+ name;
        return message;
    }


static string greet(){
    String greeString = ("how are you ");
    return greet();
}
}

