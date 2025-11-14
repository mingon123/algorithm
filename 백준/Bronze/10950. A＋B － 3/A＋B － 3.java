import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int answer = 0;
            
            for(int j=0;j<=1;j++){
                answer += sc.nextInt();
            }
            
            System.out.println(answer);
        }
        
        
    }
}