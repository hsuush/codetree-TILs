import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {

    public static ArrayList<ArrayList<Integer>> graph;
    public static int N, E;

    public static boolean[] visited;


    public static int count = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        graph = new ArrayList<>();
        N = parseInt(st.nextToken());
        E = parseInt(st.nextToken());

        visited = new boolean[N+1];

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        // 그래프 생성
        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        visited[1] = true;
        DFS(1);
        System.out.println(count);

    }

    public static void DFS(int vertex){
        for(int i = 0; i < graph.get(vertex).size(); i++){
            int currV = graph.get(vertex).get(i);
            if(!visited[currV]){
                visited[currV] = true;
                count++;
                DFS(currV);
            }
        }
    }
}