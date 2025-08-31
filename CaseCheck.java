import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("enter the charaeter:");
        char ch = in.next().trim().charAt(0);

        // String word = "hello";
        // Scanner in = new Scanner(System.in);
        // System.out.print("enter the number:");

        // Scanner in = new Scanner(System.in);

        // System.out.println(word.charAt(1));
        
        if (ch >= 'a' && ch <= 'z'){
            // System.out.println("ente the latter:");
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
