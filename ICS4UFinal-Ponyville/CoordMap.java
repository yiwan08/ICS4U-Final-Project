import java.util.*;
import java.io.*;
/**
 * Map, contains map and various methods that a map needs
 * Created when WarWorld is created, reflects map.
 * 
 * @author Thomas
 * @version 1.0
 */
public class CoordMap{
    // instance variables - replace the example below with your own
    
    //Change by George, change Node from private to public
    private Node[][] mp;
    private int gridX, gridY; //number of grids
    private int xpix, ypix; //number of pixels in the x and y axis
    private int pixX, pixY; //Number of pixels per grid
    
    //Constructor: map id, map
    public CoordMap(int mapId, int xsiz, int ysiz, int xpix, int ypix){
        this.gridX = xsiz; this.gridY = ysiz;
        this.xpix = xpix; this.ypix = ypix;
        pixX = xpix/xsiz; pixY = ypix/ysiz;
        mp = new Node[ysiz][xsiz];
        /*
         * Change this part to read auto-generated stuff.
        try{
            FastReader fr = new FastReader(new FileReader("./maps/"+mapId+".txt"));
            for(int i=0; i<ysiz; i++){
                for(int j=0; j<xsiz; j++){
                    mp[i][j] = new Node(fr.nextInt());
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Unexpected Exception! Your program is probably corrupt.");
        }
        */
    }
    
    public int[] getSz(){
        return new int[]{pixX, pixY};
    }
    
    public Node[][] getNodeMap(){
        return mp;
    }

    public int getType(int x, int y){
        if(y>=gridY || x>=gridX)
            return -1;
        return mp[y][x].getT();
    }
    
    //The method below is added by George
    public Node getNode(int x, int y){
        return mp[y][x];
    }
    
    public int getSlow(int x, int y){
        if(y>=gridY || x>=gridX)
            return -1;
        return mp[y][x].getT();
    }
    
    public int[] getMaxes(){
        return new int[]{gridX, gridY};
    }
    
    //input value is zero-indexed, get pixel position from grid value
    public int[] getPixes(int[] coord){
        return new int[]{coord[0]*pixX + pixX/2, coord[1]*pixY + pixY/2};
    }
    
    //given a pixel x and y, return corresponding x and y of grid, 0-positioned
    public int[] getMaps(int[] coord){
        return new int[]{coord[0]/pixX, coord[1]/pixY};
    }
    
    //Fastreader
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader(FileReader in) {
            br = new BufferedReader(in);
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        String nextLine() {
            String str = null;
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
