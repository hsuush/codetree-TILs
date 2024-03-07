import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int res = (int)add(num);
        sb.append(res);

        System.out.print(sb);

    }

    public static double add(int n){
        if(n < 10){
            return n*n;
        }

        return Math.pow(n % 10, 2) + add(n / 10);
    }
}