package byog.Core;

import byog.TileEngine.TETile;
import java.util.HashMap;
public class Map {
    /*
        Class that keeps track of one local map (overworld or dungeon)
     */
    private int H; // might not need to store these
    private int W;
    private String[][] map;
    private int[][] render_window;
    private int[] player;
    private HashMap<String, TETile> tile_map;


    public Map(int H, int W) {
        this.H = H;
        this.W = W;

         // handle world gen

    }


}
