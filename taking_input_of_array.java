import java.util.Scanner;

class taking_input_of_array
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] Arr=new int[size];
        int index = 0;
        while(index<size)
        {
            Arr[index] = sc.nextInt();
            index+=1;
        }
        index = 0;
        while(index<size)
        {
            System.out.print(Arr[index] + " ");
            index+=1;
        }
     sc.close();
    }
}