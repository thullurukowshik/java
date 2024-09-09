import java.util.Scanner;
class binary_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        String str = "";
        while (num > 0){
            count = num % 2;
            str = String.valueOf(count + " ")+ str ;
            num = num / 2;
        }
        System.out.println(str);
    }
}
