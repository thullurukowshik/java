import java.util.*;
class sum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[5];

        for (int i = 0 ; i<5; i++)
        {
            while(num>0)
            {
                int n1 = num % 10;
                arr[i] = n1;
                int n2 = num / 10;
                num = n2;
                break;   
            }
        }
        int sum = 0;
        for (int i=0;i<5;i++)
        {
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}