import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = parseInt(st.nextToken());

        Integer[] arr = new Integer[n+1];
    
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < n+1; i++){
            arr[i] = parseInt(st.nextToken());
        }

        for(int i = 1; i < n+1; i++){
            if(i % 2 == 1){
                Arrays.sort(arr, 1, i+1);
                sb.append(arr[(1+i)/2]);
                sb.append(" ");
            }
        }

        System.out.print(sb);
    }
}