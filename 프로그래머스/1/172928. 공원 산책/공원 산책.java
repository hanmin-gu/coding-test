import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int x=0;
        int y=0;
        int h = park.length;
        int w = park[0].length();
     
        for(int i=0; i < park.length; i++){
            int idx = park[i].indexOf("S");
            
            if(idx != -1){
                y=i;
                x=idx;
                break;
            }
          
        }
        
        Map<String, int[]> dirMap = new HashMap<>();
        dirMap.put("N", new int[]{-1, 0});
        dirMap.put("S", new int[]{1, 0});
        dirMap.put("W", new int[]{0, -1});
        dirMap.put("E", new int[]{0, 1});
        
        for(String route : routes){
            String[] inf = route.split(" ");
            String dir = inf[0];
            int loc = Integer.parseInt(inf[1]);
            
            int dy = dirMap.get(dir)[0];
            int dx = dirMap.get(dir)[1];
        
            int nx=x;
            int ny=y;
            boolean valid = true;
            
            for (int i = 0; i < loc; i++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || ny < 0 || nx >= w || ny >= h || park[ny].charAt(nx) == 'X'){
                    valid = false;
                    break;
                }
            }

            if (valid) {
                x = nx;
                y = ny;
            }
        }
            return new int[]{y, x};
    }
}
