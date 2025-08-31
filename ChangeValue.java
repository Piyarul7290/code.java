import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        Scanner 
        int[]arr  = { 1,3,4,5,6,7,};
        changeF(arr);
        System.out.println(Arrays.toString(arr));

    }
     static   void changeF( int[] nums){
        nums[0] = 99;
    }
}
