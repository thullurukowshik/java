import java.util.*;
class Human
{
    public Human()
    {
        System.out.println("in constructor..");
    }

    // method 
    // main difference for method and constructor is..
/* constructor can be named with the class name only
     * constructor is similar to the methods but in
       methods we has to give return type but not in constructor
     * constructor can be called by creating object with same class name only
*/
    public int add(int a)
    {
        return a+a;
    }
}

class constructor
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        int r = obj.add(3);
        System.out.println(r);
    }
}