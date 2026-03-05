import java.io.*;
import java.util.*;

public class Main {
  
    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int result=0;

    static class Node{
        int x,y;
        Node(int x, int y){
            this.x =x;
            this.y=y;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       

        N = Integer.parseInt(br.readLine().trim());
        //M = Integer.parseInt(br.readLine().trim());


        visited = new boolean[N][N];
        map = new int[N][N];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> sizes = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    sizes.add(bfs(new Node(i,j)));
                    
                }
            }
        }

        Collections.sort(sizes);

        System.out.println(sizes.size());
        
        for(int num : sizes){
            System.out.println(num);
        }
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
    
    static int bfs(Node start) {
        int st_x = start.x;
        int st_y = start.y;
        int count=0;

        Queue<Node> q = new LinkedList<>();
        q.add(start);
        visited[st_x][st_y] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();
            count++;

            for(int i=0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                    if(!visited[nx][ny] && map[nx][ny] == 1){
                        visited[nx][ny] = true;
                        q.add(new Node(nx, ny));
                    }
                }
            }
        }

        return count;
    }



}
