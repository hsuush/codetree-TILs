import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> result= new ArrayList<>();
    public static int count = 0;

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
            System.out.println(result.get(0) + " " + result.get(1));
            return;
        }

        for(int i = 1; i < k+1; i++){
            result.add(i);
            choose(curNum + 1);
            result.remove(result.size() - 1);
        }
    }
}