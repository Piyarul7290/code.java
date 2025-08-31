// import java.util.Scanner;
// public class NestedSwitch {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int empID = in.nextInt();
//         String department = in.next();

//         switch (empID) {
//             case 1:
//             System.out.println("piyarul sekh");
//             break;
//             case 2:
//             System.out.println("iyarul sekh");
//             break;
//             case 3:
//             System.out.println("Emp Number 3");
//             Switch (department) {
//                 case "IT":
//                 System.out.println("IT Department");
//                 break;
//                 case "Management":
//                 System.out.println("Management Depertment");
//                 break;
//                 default:
//                 System.out.println("No department entered");

//             }
//             break;
//             default:
//             System.out.println("Enter correct EmpID");
//         }
//     }
// }

              
// }  System.out.println("IT Department");
//                 break;
//                 case "Management":
//                 System.out.println("Management Depertment");
//                 break;
//                 default:
//                 System.out.println("No department entered");

//             }
//             break;
//             default:
//             System.out.println("Enter correct EmpID");
//         }
//     }

import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
            System.out.println("piyarul sekh");
            break;
            case 2:
            System.out.println("iyarul sekh");
            break;
            case 3:
            System.out.println("Emp Number 3");
            switch (department) {

                System.out.println("IT Department");
                 case "IT":          
                break;
                case "Management":
                // case "Management":
                System.out.println("Management Depertment");
                break;
                default:
                System.out.println("No department entered");

            }
            break;
            default:
            System.out.println("Enter correct EmpID");
        }
        in.close();
    }
}