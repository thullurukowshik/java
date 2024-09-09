 
import java.util.Scanner;
class Years_weeks_days{
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year = days/365;
        int weeks = (days-(365*year))/7;
        System.out.println("years :" + year);
        System.out.println("weeks :" + weeks);
        System.out.println("days :" + (days-((365*year)+(weeks*7))));
        sc.close();
    }
}
// another method
/* int years = total / 365;
        int remainingdays = total % 365;
        int weeks = remainingdays / 7;
        int days = remainingdays % 7;
 */