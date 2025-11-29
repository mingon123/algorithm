import java.io.*;

public class Main{
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<t;i++){
            String s = br.readLine();
            String[] sArr = s.split(" ");
            
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[1]);
            
            sb.append(a + b).append("\n");            
        }
        System.out.print(sb.toString());
    }
}