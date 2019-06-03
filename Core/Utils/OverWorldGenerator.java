package byog.Core.Utils;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

public class OverWorldGenerator extends MapGenerator {
    private String type = "overworld"; // check necessity
    private int H;
    private int W;
    private long seed;

    //OverWorld Noise Params
    private double constant = 0.17;
    private double normalized_constant = 5;
    private double water_thresh = 0.3;
    private double sand_thresh = 0.35;
    private double grass_thresh = 0.64;
    private double tree_thresh = 0.74;
    private double mountain_thresh = 0.8;


    // init
    public OverWorldGenerator(int H, int W, long seed) {
        this.H = H;
        this.W = W;
        this.seed = seed;
    }

    public TETile[][] generate() {
        if (type.equals("overworld")) {
            TETile[][] ret = new TETile[this.H][this.W];
            OpenSimplexNoise generator = new OpenSimplexNoise(seed);
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    double val = generator.eval((double) i * constant, (double) j * constant);
                    ret[i][j] = terrain_pick(val);
                }
            }
            return ret;

        } else {
            return null;
        }
    }

    // overworld helper
    private TETile terrain_pick(double val) {
        double normalized = (val + 1) * normalized_constant;
        if (normalized < water_thresh * 2 * normalized_constant) {
            return Tileset.WATER;
        } else if (normalized < sand_thresh * 2 * normalized_constant) {
            return Tileset.SAND;
        } else if (normalized < grass_thresh * 2 * normalized_constant) {
            return Tileset.GRASS;
        } else if (normalized < tree_thresh * 2 * normalized_constant) {
            return Tileset.TREE;
        } else if (normalized < mountain_thresh * 2 * normalized_constant) {
            return Tileset.MOUNTAIN;
        } else {
            return Tileset.SNOWM;
        }
    }

}
