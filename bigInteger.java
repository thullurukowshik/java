import java.math.BigInteger;
import java.math.BigInteger;

class bigInteger {
    public static void main(String[] args) {
        String str = "51090942171709440000";
        BigInteger bigNum = new BigInteger(str); // declaring bigNum as BigInteger variable and initializing it.
        System.out.println(bigNum);
        System.out.println(bigNum.getClass().getSimpleName());
    }
}
//string id converted to bigInteger directly by the BigInteger obj.
