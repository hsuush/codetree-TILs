import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append("\n");

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        
        System.out.print(sb);
    }
}