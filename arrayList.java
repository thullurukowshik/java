import java.util.*;
import java.util.*;
class arrayList {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        //SORTING OF ELEMENTS
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(1);
        arrList.add(4);
        Collections.sort(arrList);
        System.out.println(arrList);
        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList);
        
       
       // FREQUENCY OF ELEMENTS:-
        // ArrayList<Integer> arrList = new ArrayList<>();
        // arrList.add(1);
        // arrList.add(2);
        // arrList.add(1);
        // arrList.add(1);
        // int freq = Collections.frequency(arrList,1);
        // System.out.println(freq);


        //INDEXOF ELEMENTS IN ARRAYLISTS
        // ArrayList<Integer> arrList = new ArrayList<>();
        // arrList.add(3);
        // arrList.add(6);
        // arrList.add(2);
        // arrList.add(1);
        // System.out.println(arrList);
        // int index = arrList.indexOf(6);
        // System.out.println(index);        


        // conversion of array to arraylist:-
        // Integer[] Array= {1,2,3,4};
        // for (int each:Array){
        //     System.out.print(each + " ");
        // }
        // System.out.println();
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(Array));
        // System.out.println(arrList);

        // coversion of arrayList to Array:-
        // ArrayList<Integer> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextInt());
        // }
        // System.out.println(arrList);
        // Integer[] Array= new Integer[arrList.size()];
        // arrList.toArray(Array);
        // for (int each:Array){
        //     System.out.print(each + " ");
        // }
        // System.out.println(Array.getClass().getSimpleName());

        // Slicinf of ArrayList
        // System.out.println(arrList.subList(0,2));

        //Concatenation of Arraylists
        // ArrayList<Integer> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextInt());
        // }
        // ArrayList<Integer> arrList1 = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList1.add(sc.nextInt());
        // }
        // System.out.println(arrList);
        // System.out.println(arrList1);
        // arrList1.addAll(arrList);
        // System.out.println(arrList1);



        // System.out.println(arrList.size());


        // arrList.clear();
        // System.out.println(arrList);
        
        // ArrayList<Integer> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextInt());
        // }
        // System.out.println(arrList);
        // arrList.remove(2);
        // System.out.println(arrList);
        
        // ArrayList<Integer> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextInt());
        // }
        // System.out.println(arrList);
        // Integer num =  arrList.get(3);
        // System.out.println(num);
        
        // Array Set Method
        // ArrayList<Integer> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextInt());
        // }
        // System.out.println(arrList);
        // arrList.set(3,10);
        // System.out.println(arrList);
        

        //Array list reading inputs.
        // ArrayList<String> arrList = new ArrayList <>();
        // for (int i = 0;i<4;i++){
        //     arrList.add(sc.nextLine());
        // }
        // System.out.println(arrList);

        
        //ArrayList method Adding elements
        // ArrayList<String> arrList = new ArrayList <>();
        // arrList.add("kowshiik");
        // arrList.add("kowsh");
        // arrList.add("kowshk");
        // arrList.add("shiik");
        // System.out.println(arrList);
    }
}
