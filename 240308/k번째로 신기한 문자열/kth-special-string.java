import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0; i < n; i++){
            boolean exits = arr[i].matches(T + ".*");

            if(exits){
                count++;
                if(count == k){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}