import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static int n,m;
    public static int[][] grid;
    public static int[][] water;
    public static int[][] visited;
    public  static int area = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());

        grid = new int[n][m];
        water = new int[n][m];
        visited = new int[n][m];

        ArrayList<Integer> K = new ArrayList<>();
        int max= 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                grid[i][j] = parseInt(st.nextToken());
                if(grid[i][j] > max) max = grid[i][j];
            }
        }

        K.add(0);
        for(int i = 1; i <= max; i++){
            water(i);
            area = 0;
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m ; k++){
                    if(visited[j][k]==0 && water[j][k] == 0){
                        visited[j][k] = 1;
                        // 여기서 전부 1인 상황을 잡아야함...
                        area++;
                        DFS(j,k);
                    }
                }
            }
            K.add(area);
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    visited[j][k] = 0;
                }
            }
        }

        if(max == 1) System.out.println(1 + " " + 0);
        else {
            int kMax = 0;
            int iMax = 0;
            for (int i = 1; i <= max; i++) {
                if (K.get(i) > kMax) {
                    kMax = i;
                    iMax = K.get(i);
                }
            }

            System.out.println(kMax + " " + iMax);
        }

    }
    public static void water(int temp){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // 1이 물에 잠긴 상태, 0은  잠기지않은 상태
                if(grid[i][j] == temp){
                    water[i][j] = 1;
                }
            }
        }

    }

    public static void DFS(int x, int y){
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(CanGo(newX, newY)){
                visited[newX][newY] = 1;
                DFS(newX, newY);
            }
        }

    }

    public static boolean CanGo(int x, int y){
        if(x < 0 || x == n || y < 0 || y == m){
            return false;
        } else if (water[x][y] == 1 || visited[x][y] == 1){
            return false;
        }
        return true;
    }

}