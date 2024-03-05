import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        int result = 0;

        for(int i = 0; i < n; i++){
            st =  new StringTokenizer(br.readLine());
            for(int j = 0; j <  n;  j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < n; i++){
            int count = 0;
            for(int j = 0; j < n-1; j++){
                if(arr[i][j] == arr[i][j+1]) count++;
                if(count+1 == m){
                    result++;
                }
            }
        }

        for(int i = 0 ; i < n; i++){
            int count = 0;
            for(int j = 0; j < n-1; j++){
                if(arr[j][i] == arr[j+1][i]) count++;
                if(count+1 == m){
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}