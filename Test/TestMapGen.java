package byog.Test;

import static org.junit.Assert.assertEquals;

import byog.Core.Utils.OverWorldGenerator;
import byog.TileEngine.TERenderer;
import byog.TileEngine.TETile;


public class TestMapGen {
    public static void main(String[] args) {
        long seed = 1234567l;
        OverWorldGenerator test1 = new OverWorldGenerator(70, 70, seed);
        TETile[][] map = test1.generate();

        TERenderer render = new TERenderer();
        render.initialize(70, 70, 0, 0);
        render.renderFrame(map);
    }

}
