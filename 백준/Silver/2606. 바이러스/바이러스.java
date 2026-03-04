import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int result=0;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      

        N = Integer.parseInt(br.readLine().trim());
        M = Integer.parseInt(br.readLine().trim());

        
        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
        
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }


        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(1);

        System.out.println(result-1);
    }

    static void dfs(int node){
        visited[node] = true;
        result++;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
        

    }
    /* 
    static int bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0,1));
        visited[0][0] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();
            
            if(cur.x == N - 1 && cur.y == M-1) return cur.dist;

            for(int i=0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(nx>=0 && ny>=0 && nx< N && ny < M){
                    if(!visited[nx][ny] && map[nx][ny]== 1){
                        visited[nx][ny] = true;
                        q.add(new Node(nx,ny,cur.dist + 1));
                    }

                }
            }
         
        }
        return -1;
    }*/
}
