import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class Main {
    public static final int MAX_N = 200;

    public static int n,m;
    public  static int max = 0;
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        // 네모먼저 판별하고 직사각형 판별 최댓값 바꿔주면됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        // 사각형으로 알아보기
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                int tmp = recMax(i, j);
                if(tmp > max){
                    max  = tmp;
                }
            }
        }

        // 직사각형으로 알아보기
        //행
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m-2; j++){
                if(m < 3) return;
                int temp = 0;
                temp += arr[i][j];
                temp += arr[i][j+1];
                temp += arr[i][j+2];

                if(max < temp) max = temp;
            }
        }

        //열
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n-2; i++){
                if(n < 3) return;
                int temp = 0;
                temp += arr[i][j];
                temp += arr[i+1][j];
                temp += arr[i+2][j];

                if(max < temp) max = temp;
            }

        }
        System.out.println(max);
    }
    public static int recMax(int i, int j){
        int sum = 0;
        int min = 1000;
        int res;

        int a = arr[i][j];
        sum += a;
        if (min > a) min = a;

        int b = arr[i][j + 1];
        sum += b;
        if (min > b) min = b;

        int c = arr[i + 1][j];
        sum += c;
        if (min > c) min = c;

        int d = arr[i + 1][j + 1];
        sum += d;
        if (min > d) min = d;

        res = sum - min;

        return res;
    }

}