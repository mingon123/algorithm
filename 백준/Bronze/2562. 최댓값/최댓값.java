import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int max = Integer.MIN_VALUE;
            
        for(int i=1;i<=9;i++){
            int num = sc.nextInt();
            
            if(num > max){
                max = num;
                cnt = i;
            }
        }
        
        System.out.println(max);
        System.out.println(cnt);
    }
}