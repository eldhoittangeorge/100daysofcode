import java.util.Arrays;

public class ar {
    public static void main(String args[]){
        int[] n = {2,3,4};
        int[] m = n;
        System.out.println(n[0]);
        m[0] = 5;
        System.out.println(n[0]); 
    }
}