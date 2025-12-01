import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int [] iArr = new int[n + 1];
        
        for(int a=0;a<m;a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int b=i;b<=j;b++){
                iArr[b] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int c=1;c<=n;c++){
            sb.append(iArr[c]).append(" ");
        }        
        System.out.print(sb.toString());
    }
}