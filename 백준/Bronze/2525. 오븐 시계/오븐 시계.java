import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int t = sc.nextInt();
        
        int h = 0;
        
        while(t >= 60) {
            t -= 60;
            h++;
        }
        int m = t;
        
        hour += h;
        min += m;
        
        if(min >= 60){
            hour++;
            min -= 60;
        }
        
        while(hour >= 24){
            hour -= 24;
        }
        
        System.out.println(hour + " " + min);
    }
}