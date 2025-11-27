import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            int cnt = sc.nextInt();
            
            answer += value * cnt; 
        }
        
        if(x == answer) System.out.println("Yes");
        else System.out.print("No");
    }
}