import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;

    static int[] dr = {-1, 1, 0, 0}; 
    static int[] dc = {0, 0, -1, 1};

    static class Node {
        int rr, rc, br, bc, cnt;
        Node(int rr, int rc, int br, int bc, int cnt) {
            this.rr = rr; this.rc = rc; this.br = br; this.bc = bc; this.cnt = cnt;
        }
    }

    
    static class MoveResult {
        int r, c, moved;
        boolean inHole;
        MoveResult(int r, int c, int moved, boolean inHole) {
            this.r = r; this.c = c; this.moved = moved; this.inHole = inHole;
        }
    }

    static MoveResult roll(int r, int c, int dir) {
        int moved = 0;
        while (true) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (board[nr][nc] == '#') break;      
            r = nr; c = nc;
            moved++;

            if (board[r][c] == 'O') {             
                return new MoveResult(r, c, moved, true);
            }
        }
        return new MoveResult(r, c, moved, false);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        int rr = -1, rc = -1, brR = -1, brC = -1;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') { rr = i; rc = j; board[i][j] = '.'; }
                if (board[i][j] == 'B') { brR = i; brC = j; board[i][j] = '.'; }
            }
        }

        boolean[][][][] visited = new boolean[N][M][N][M];
        Queue<Node> q = new ArrayDeque<>();
        visited[rr][rc][brR][brC] = true;
        q.offer(new Node(rr, rc, brR, brC, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (cur.cnt >= 10) continue; 

            for (int dir = 0; dir < 4; dir++) {
                MoveResult red = roll(cur.rr, cur.rc, dir);
                MoveResult blue = roll(cur.br, cur.bc, dir);

            
                if (blue.inHole) continue;

              
                if (red.inHole) {
                    System.out.println(cur.cnt + 1);
                    return;
                }

                
                if (red.r == blue.r && red.c == blue.c) {
                
                    if (red.moved > blue.moved) {
                        red.r -= dr[dir];
                        red.c -= dc[dir];
                    } else {
                        blue.r -= dr[dir];
                        blue.c -= dc[dir];
                    }
                }

                if (!visited[red.r][red.c][blue.r][blue.c]) {
                    visited[red.r][red.c][blue.r][blue.c] = true;
                    q.offer(new Node(red.r, red.c, blue.r, blue.c, cur.cnt + 1));
                }
            }
        }

        System.out.println(-1);
    }
}