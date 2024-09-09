//denominations 1
import java.util.*;
public class denominations{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);        int num = sc.nextInt();
        int a = num/100;
        int r1 = num%100;
        int b = r1/50;
        int r2 = r1%50;
        int c = r2/10;
        int r3 = r2%10;
        String result = "100 : %d\n50 : %d\n10 : %d\n1 : %d"; 
        System.out.printf(result,a,b,c,r3);
    }
}