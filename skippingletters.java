 import java.util.Scanner;
class skippingletters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();
        int len = word.length();
        if (num==len)
        {
            System.out.println(word);
        }
        else
        {
            String sub_string_1 = word.substring(0,num);
            String sub_stirng_2 = word.substring(num+1);
            System.out.println(sub_string_1+sub_stirng_2);
        }
        
    }
}

