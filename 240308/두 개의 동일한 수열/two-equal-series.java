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

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr1[i] = parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr2[i] = parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < n; i++){
            if(arr1[i] != arr2[i]){
                System.out.print("No");
                break;
            }
        }
        System.out.print("Yes");
    }
}