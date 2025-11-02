import java.util.*;

public class Main{
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        
        int value = sc.nextInt();
        int answer = 0;
        
        for(int i : arr){
            if(i == value) answer++;
        }
        
        System.out.println(answer);
    } 
}