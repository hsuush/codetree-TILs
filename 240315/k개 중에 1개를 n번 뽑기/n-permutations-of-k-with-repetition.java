import java.util.*;
import java.io.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static int k;
    public static int n;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        choose(1);
    }

    public static void choose(int curNum){

        if(curNum == n+1){
            System.out.println(sb);
            return;
        }

        for(int i = 1; i < k+1; i++){
            sb.append(i);
            sb.append(" ");
            choose(curNum + 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}