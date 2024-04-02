import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {

    public static int N;
    public static int[][] grid;
    public static int[][] visited;

    public static ArrayList<Integer> number = new ArrayList<>();
    public static int town = 0;
    public static int people = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = parseInt(st.nextToken());
        grid = new int[N][N];
        visited = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                grid[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i][j] == 0 && grid[i][j] == 1){
                    people = 1;
                    visited[i][j] = 1;
                    DFS(i,j);
                    number.add(people);
                    town++;

                }
            }
        }

        sb.append(town);
        sb.append('\n');
        number.sort(Comparator.naturalOrder());
        for (Integer integer : number) {
            sb.append(integer);
            sb.append('\n');
        }

        System.out.print(sb);


    }

    public static void DFS(int x, int y){
        int[] dx = new int[] {1, 0, -1 , 0};
        int[] dy = new int[] {0, 1, 0, -1};

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(CanGo(newX, newY)){
                visited[newX][newY] = 1;
                people++;
                DFS(newX, newY);
            }
        }

    };
    public static boolean CanGo(int x, int y){
        if(x < 0 || x == N || y < 0 || y == N){
            return false;
        } else if(visited[x][y] == 1 || grid[x][y] == 0){
            return false;
        }
        return true;
    }
}