import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int z=0;z<n;z++) arr[z] = z + 1;
        
        for(int z=0;z<m;z++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }
        StringBuilder sb = new StringBuilder();
        for(int num : arr) sb.append(num).append(" ");
        
        System.out.println(sb.toString());
    }
}