import java.util.Scanner;
class masking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word = sc.nextLine();
        char start = word.charAt(0);
        int len = word.length();
        char end = word.charAt(len - 1);
        String mid = "*".repeat(len-2);
        System.out.println(start + mid + end);
    }
}

/*input = kowshik , output = k*****k. */
