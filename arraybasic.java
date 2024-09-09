import java.util.*;
class arraybasic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

                
        //reading and printing array
        // Two dimensional array
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // int[][] Array = new int[m][n];
        // for (int i=0;i<m;i++)
        // {
        //     for (int j=0;j<n;j++)
        //     {
        //         Array[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i=0;i<m;i++)
        // {
        //     for (int j=0;j<n;j++)
        //     {
        //         System.out.print(Array[i][j] + " ");
        //     }
        //     System.out.println();

            //printing jagged array
            // int[][] Array = new int[3][];
            // Array[0] = new int[2];
            // Array[1] = new int[4];
            // Array[2] = new int[1];
            
    
            // for (int i=0;i<3;i++)
            // {
            //     for (int j=0;j<Array[i].length;j++)
            //     {
            //         Array[i][j] = sc.nextInt();
            //     }
            // }
            // for (int i=0;i<3;i++)
            // {
            //     for (int j=0;j<Array[i].length;j++)
            //     {
            //         System.out.print(Array[i][j] + " ");
            //     }
            //     System.out.println();
            // }
        }
    }
// } 
    
