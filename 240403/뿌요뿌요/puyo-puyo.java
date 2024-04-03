import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Main {

    public static int[][] grid;
    public static int[][] visited;
    public static int n;
    public static int max = 0;
    public static int bumb = 0;
    public static int block = 0;

    public static ArrayList<Integer> k = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n=parseInt(st.nextToken());

        grid = new int[n][n];
        visited = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n ; j++){
                grid[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(visited[i][j] == 0){
                    block = 0;
                    block++;
                    visited[i][j] = 1;
                    int num = grid[i][j];
                    DFS(i,j, num);
                    k.add(block);
                    if(block > 3){
                        bumb++;
                    }
                    if(block > max){
                        max = block;
                    }
                }
            }
        }

        System.out.print(bumb + " " + max);

    }
    public static void DFS(int x, int y, int num){
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(CanGo(newX, newY, num)){
                visited[newX][newY] = 1;
                block++;
                DFS(newX, newY, num);
            }
        }

    }

    public static boolean CanGo(int x, int y, int num){
        if(x < 0 || x == n || y < 0 || y == n){
            return false;
        } else if(grid[x][y] != num || visited[x][y] == 1){
            return false;
        }
        return true;
    }
}