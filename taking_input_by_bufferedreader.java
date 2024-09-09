import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;


class taking_input_by_bufferedreader{
    public static void main(String a[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(inp);
        int number =Integer.parseInt(bf.readLine());
        System.out.println(number);
    }
}