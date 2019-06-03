package byog.Core.Utils;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

public class DungeonGenerator extends MapGenerator {
    int H;
    int W;
    long seed;

    // params
    int num_rooms;
    int[] H_range = new int[]{5, 10};
    int[] W_range = new int[]{6, 12};

    public DungeonGenerator(int H, int W, long seed) {
        this.H = H;
        this.W = W;
        this.seed = seed;
    }

    // TODO: correlate size of dungeon to size and number of rooms

    public TETile[][] generate() {
        /*
            Steps to generate new dungeon:
                - init TETile[][] with NOTHING
                - init room dimensions
                - draw rooms with offsets
                - pick random NOTHING tile, dfs (set of visited spots, also add
         */

        TETile[][] dungeon = new TETile[H][W];
        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < W; j ++) {
                dungeon[i][j] = Tileset.NOTHING;
            }
        }
        //TODO: fill in rooms




        return null;
    }

    // TODO: finish room generation
    private int[][] rooms() {
        return null;
    }


    // TODO: finish BSP Tree implementation
    private class BSPTree {
        private class TreeNode {
            int[] top_left;
            int[] bottom_right;
            TreeNode sub_space1;
            TreeNode sub_space2;

            private TreeNode(int[] top_left, int[] bottom_right) {
                this.top_left = top_left;
                this.bottom_right = bottom_right;
            }
        }
    }


}
