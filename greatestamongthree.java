import java.util.Scanner;
class greatestamongthree {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int result = (a>b && a>c)? a : (b>c && b>a)?b:c;
            System.out.println(result);
        }
    }