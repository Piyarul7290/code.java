import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // System.out.println("enter fruits name:");
        Scanner in = new Scanner(System.in);

        //  System.out.println("enter week  name:");
        // String fruit = in.next();

        // switch (fruit){
        //     case "Mango":
        //     System.out.println("king of fruits");
        //     break;
        //     case "Apple":
        //     System.out.println("A sweet red fruits");
        //     break;

        //     case "Orange":
        //     System.out.println("Round fruits");
        //     break;

        //     case "Grapes":
        //     System.out.println("Smalle fruits");
        //     break;

        //     default:
        //     System.out.println("pleasc a valid fruit");
        // }
        // System.out.println("enter the week name:");
        int day = in.nextInt();
        // System.out.println("enter the week name:");
        // switch (day) { 
        //     case 1:
        //     System.out.println("Monday");
        //     break;

        //     case 2:
        //     System.out.println("Tuesday");
        //     break;

        //     case 3 :
        //     System.out.println("Wednesday");
        //     break;

        //     case 4:
        //     System.out.println("Thursday");
        //     break;

        //     case 5:
        //     System.out.println("Friday");
        //     break;

        //     case 6:
        //     System.out.println("Saturday");
        //     break;

        //     case 7:
        //     System.out.println("Sunday");
        //     break;
        // }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekday");
            break;

            case 6:
            case 7:
            System.out.println("Weekend");
            break;
        }
    }
}
