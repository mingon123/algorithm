import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int value = sc.nextInt();
        
        char[] cArr = s.toCharArray();
        
        System.out.print(cArr[value - 1]);
    }
}