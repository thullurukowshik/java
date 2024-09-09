class Calculation
{
    public int fact(int n)
    {
        if (n <=1)
        {
            return 1;
        } 
        return n * fact(n-1);
    }

}
class methods
{
    public static  void main(String[] args)
    {
        Calculation obj = new Calculation();
        int re = obj.fact(4);
        System.out.println(re);
    }
}