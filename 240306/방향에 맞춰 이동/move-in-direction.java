import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        // 네모먼저 판별하고 직사각형 판별 최댓값 바꿔주면됨
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[100][100];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int nx, ny;

        int x = 0, y = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());



        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String  dir = st.nextToken();
            int dis = Integer.parseInt(st.nextToken());
            switch(dir){
                case "E":
                    x = x + dis*dx[0];
                    break;
                case "W":
                    x =  x + dis*dx[1];
                    break;
                case "S":
                    y = y + dis*dy[2];
                    break;
                case "N":
                    y = y + dis*dy[3];
                    break;
            }
        }
        sb.append(x);
        sb.append(" ");
        sb.append(y);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}