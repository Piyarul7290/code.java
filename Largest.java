import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the frist number:");
        int a = in.nextInt();
        System.out.print("enter the second number:");
        int b = in.nextInt();
        System.out.print("enter the thred number:");
        int d = in.nextInt();

        // int max = a;
        // if (b > max){
        //     max = b;
        // }
        // // if (c > max){20
        
        // //     max = c; 
        // // }

        // System.out.println(max);
        int max = Math.max(d, Math.max(a, b));
        System.out.println(max);
    }
}
