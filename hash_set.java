import java.util.*;

public class hash_set {
    public static void main(String[] args){
    HashSet<Integer> hset=new HashSet<>();
    hset.add(1);
    hset.add(2);
    hset.add(3);
    hset.add(4);
    hset.add(8);
    HashSet<Integer> hset1=new HashSet<>();
    hset1.add(9);
    hset1.add(8);
    hset1.add(3);
    hset1.add(5);
    hset1.add(10);


    //converting set to arraylist 
    // ArrayList<Integer> arrList = new ArrayList<>(hset);
    // System.out.println(arrList);

    //sorting the set by using treeset
    // TreeSet<Integer> hset2=new TreeSet<Integer>();
    // hset2.add(9);
    // hset2.add(8);
    // hset2.add(3);
    // hset2.add(5);
    // hset2.add(10);
    // System.out.println(hset2);
    
    

    // superset and subset
    // System.out.println(hset.containsAll(hset1));//superset checking
    // System.out.println(hset1.containsAll(hset));//subset checking
        
    // difference of two sets
    // hset.removeAll(hset1);
    // System.out.println(hset);[1, 2, 4]

    //intersection of two sets
    // hset.retainAll(hset1);
    // System.out.println(hset);[3, 8]


    // union of two sets
    // hset.addAll(hset1);
    // System.out.println(hset);[1, 2, 3, 4, 5, 8, 9, 10]
    

    // size of a hashset
    // System.out.println(hset.size());

    // element is present or not
    // System.out.println(hset.contains(3));


    //removes all elements
    // hset.clear();
    // System.out.println(hset);

    //removing elements
    // hset.remove(3);
    // System.out.println(hset);

    
    // ADDING ELEMENTS
    // hset.add(1);
    // hset.add(2);
    // hset.add(3);
    // hset.add(4);
    // hset.add(8);
    // System.out.println(hset);
    }
}
