import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Main {

    //길표시 grid랑 방문했는지 여부를 알릴 2차원배열 필요
    public static int[][] grid;
    public static int[][] visited;

    public static int N,M;

    public static int x = 0, y = 0;

    public static int newX, newY;

    public static int result = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = parseInt(st.nextToken());
        M = parseInt(st.nextToken());
        grid = new int[N][M];
        visited = new int[N][M];


        //GRID랑 VISITED 생성
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                grid[i][j] = parseInt(st.nextToken());
            }
        }

        visited[0][0] = 1;
        DFS(0,0);
        System.out.println(result);
    }

    public static void DFS(int x, int y){
        int[] dx = new int[] {0,1};
        int[] dy = new int[] {1,0};

        for(int i = 0; i < 2; i++){
            newX = x + dx[i];
            newY = y + dy[i];
            if(newX == N-1 && newY == M-1){
                result++;
                return;
            }
            if(CanGo(newX, newY)){
                visited[newX][newY] = 1;
                DFS(newX, newY);
            }
        }
    }

    // 뱀이 있는지, 격자를 벗어나진 않는지, 이미 지나온 곳인지 확인 필요
    public static boolean CanGo(int newX, int newY){
        if(newX < 0 || newX == N || newY < 0 || newY == M){
            return false;
        }else if(grid[newX][newY] == 0 || visited[newX][newY] == 1)
            return false;
        return true;
    }

}