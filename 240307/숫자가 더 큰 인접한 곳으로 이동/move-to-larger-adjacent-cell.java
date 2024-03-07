import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 101;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int r, c;
    public static int max;
    public static boolean isMax;

    public static int maxR, maxC;

    public static void main(String[] args) throws IOException  {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        for(int i = 1; i < n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < n+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        isMax = false;

        sb.append(arr[r][c]).append(" ");

        while(!isMax){
            moveMax(r,c);
            sb.append(max).append(" ");
        }

        sb.deleteCharAt(sb.length() - 2).deleteCharAt(sb.length() - 1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void moveMax(int x, int y){
        max = 0;
        String maxDir = " ";
        int current = arr[x][y];
        if(current < arr[x-1][y]) {
            max = arr[x - 1][y];
            maxDir = "up";
        } else if (current < arr[x+1][y]){
            max = arr[x+1][y];
            maxDir = "down";
        } else if (current < arr[x][y-1]){
            max = arr[x][y-1];
            maxDir = "left";
        } else if (current < arr[x][y+1]){
            max = arr[x][y+1];
            maxDir = "right";
        }

        switch(maxDir){
            case "up":
                r -= 1;
                break;
            case "down":
                r += 1;
                break;
            case "left":
                c -= 1;
                break;
            case"right":
                c += 1;
                break;

        }
        if(max == 0) {
            isMax = true;
        }
    }
}