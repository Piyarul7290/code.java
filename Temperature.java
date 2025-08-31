import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Temperature {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
   // System.out.print("please enter temp in c :");

   System.out.print("please enter temp in c:");
    float tempc = in.nextFloat();

    float tempf = (tempc * 9/5) + 32;
    
    System.out.println(tempf);
    
}
} 
