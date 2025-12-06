import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr=  new int[30];
        
        for(int i=0;i<28;i++){
            int x = sc.nextInt();
            arr[x-1]++;
        }
        
        int[] arr2 = new int[2];
        int idx = 0;
        for(int i=0;i<30;i++){
            if(arr[i] == 0) arr2[idx++] = i+1;
        }
        
        if(arr2[0] > arr2[1]){
            int temp = arr2[0];
            arr2[0] = arr2[1];
            arr2[1] = temp;
        }
        
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}