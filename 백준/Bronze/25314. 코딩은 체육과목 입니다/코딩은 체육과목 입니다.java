import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int value = num / 4;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<value;i++){
            sb.append("long ");
        }
        sb.append("int");
        
        System.out.print(sb.toString());        
    }
}