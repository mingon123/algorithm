import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        if(90<=i && i<=100) System.out.print("A");
        else if(80<=i && i<=89) System.out.print("B");
        else if(70<=i && i<=79) System.out.print("C");
        else if(60<=i && i<=69) System.out.print("D");
        else System.out.print("F");
    }
}