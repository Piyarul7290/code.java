import java.util.Scanner;
public class Fanction {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // System.out.println("enter the number 1:");
        // int num1 = in.nextInt();
        // System.out.println("enter the number 2:");
        // int num2 = in.nextInt();

        // int sum = num1+num2;
        // System.out.println("The sum = "+ sum);
        sum();

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Eter number 2:");
        int num2= in.nextInt(); 
        int sum = num1 + num2;
        System.out.println("The sum = "+ sum);
    }
}
