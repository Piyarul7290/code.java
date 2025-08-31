// import java.util.Scanner;
public class Ifstatemements {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("please enter the salary:");
         int salary = 25000;
    //     int salary = in.nextInt();
    //     if (salary > 10000){

    //     }
    //     else{
    //         salary = -1;
    //     }
    //     System.out.println (salary);
    // }
    if (salary > 10000){
        salary += 2000;
    }else if ( salary > 20000) {
       salary += 3000;
    }else{
        salary += 1000;
    }
    System.out.print("salary is :"); 
    System.out.println(salary);
    }

}
