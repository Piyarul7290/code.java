public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        

        // int temp = a;
        // a = b;
        // b = temp;

        Swap(a,b);
        System.out.println(a + " " + b);
    }
     static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
