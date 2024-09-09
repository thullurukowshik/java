import java.util.*;
public class sample{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);  
        String str = sc.nextLine();
        String word = str;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if (c == ('a'|'e'|'i'|'o'|'u'))
            {
                word.replace(c,' ');
            }
        }
        System.out.println(word);
    }

    
}