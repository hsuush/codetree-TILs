import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        int[][] res = new int[n-2][n-2];

        for(int i = 0;  i  < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < n-2; j++){
                res[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            }
        }

        int max = 0;
        for(int i = 0 ; i < n-2; i++){
            for(int j = 0;  j < n-2; j++){
                if(max  < res[i][j]) max = res[i][j];
            }
        }
        System.out.print(max);

    }
}