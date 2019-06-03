package byog.Core;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;
import byog.Core.MapGen.OpenSimplexNoise;
import byog.Core.RandomUtils;

import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

public class Map {
    /*
        Class that keeps track of one local map (overworld or dungeon)
     */
    public String name;
    private int H; // might not need to store these
    private int W;
    private TETile[][] map;
    private int[][] render_window;
    private int[] player;
    private Random random = new Random(123456789l);

    public Map(String name, int H, int W) {
        this.name = name;
        this.H = H;
        this.W = W;

        double c = 0.17;
        this.map = new TETile[H][W];
        OpenSimplexNoise generator = new OpenSimplexNoise();
        // generate noise
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                double val =  generator.eval((double)i * c, (double) j * c);
                this.map[i][j] = terrain_pick(val);

            }
        }
    }

    public TETile[][] getMap() {
        return this.map;
    }


    private TETile terrain_pick(double val) {
        double normalized = (val + 1) * 5;
        if (normalized < 3) {
            return Tileset.WATER;
        } else if (normalized < 3.5) {
            return Tileset.SAND;
        } else if (normalized < 6.3) {
            return Tileset.GRASS;
        } else if (normalized < 7.4) {
            return Tileset.TREE;
        } else if (normalized < 8) {
            return Tileset.MOUNTAIN;
        } else {
            return Tileset.SNOWM;
        }

    }


}
