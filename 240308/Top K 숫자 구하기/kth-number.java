import java.util.*;
import java.io.*;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = parseInt(st.nextToken());
        int k = parseInt(st.nextToken());

        Integer[] arr = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.print(arr[k-1]);
    }
}