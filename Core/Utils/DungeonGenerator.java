package byog.Core.Utils;

import byog.TileEngine.TETile;

public class DungeonGenerator extends MapGenerator {
    int H;
    int W;
    long seed;

    public DungeonGenerator(int H, int W, long seed) {
        this.H = H;
        this.W = W;
        this.seed = seed;
    }

    public TETile[][] generate() {
        return null;
    }
}
