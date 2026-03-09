import java.io.*;
import java.util.*;

public class Main {
  
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, start, end;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int result=0;

    static class Node{
        int v;
        int dist;

        Node(int v, int dist){
            this.v =v;
            this.dist=dist;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());


        M = Integer.parseInt(br.readLine().trim());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
    
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);

        }
        
        System.out.println(bfs());
    }

    /* 
    static void dfs(int node){
        visited[node] = true;
        result++;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
        

    }
    */
    
    static int bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(start,0));
        visited[start] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();

            if(cur.v == end){
                return cur.dist;
            }
            
            for(int next: graph[cur.v]){
                if(!visited[next]){
                    visited[next] = true;
                    q.add(new Node(next,cur.dist + 1));
                }
            }
        }
        return -1;
    }



}
