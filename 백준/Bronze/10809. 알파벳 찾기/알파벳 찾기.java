import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if(arr[idx] == -1) arr[idx] = i;
        }        
    
        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}