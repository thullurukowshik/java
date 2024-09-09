import java.util.Scanner;
class electricitybill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
         float cost=0;
         if (bill<=50) {
             cost = 2*bill;
         }
         else if (bill<=150){
             cost = (2*50) + (3 * (bill-50));
         }
         else if (bill<=250){
             cost = (2*50) + (3*100)+(5 * (bill-150));
         }
         else if (bill>250){
             cost = (2*50) + (3*100)+(5*100)+(8 * (bill-250));
         }
         double surcharge = (0.2*cost);
         System.out.println(surcharge+cost);
    }
}