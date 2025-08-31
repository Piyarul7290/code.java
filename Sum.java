import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter num1:");
        float num1 = input.nextFloat();
         System.out.print("Please enter num2:");
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("sum = " +sum);
    }
}
