import java.util.Scanner;

public class Fob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int d = 1;
        int count = 2;

        while (count <= n){
            int temp = d;
            d = d + a;
            a = temp;
            count++;
        }
        System.out.println(d);
    }
}
