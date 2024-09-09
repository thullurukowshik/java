import java.util.Scanner;
public class reversing_string {
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a1 = num%10;
        String a = Integer.toString(a1); 
        int b1 = num/10;
        String b = Integer.toString(b1); 
        System.out.println(a+b);
        
    }
}

