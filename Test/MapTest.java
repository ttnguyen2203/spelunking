package byog.Test;

import static org.junit.Assert.assertEquals;

import byog.TileEngine.TERenderer;
import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;
import edu.princeton.cs.introcs.StdDraw;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import byog.Core.Map;


public class MapTest {
    public static void main(String[] args) {
        Map test = new Map("small map", 70, 70);

        TERenderer render = new TERenderer();
        render.initialize(70, 70, 0, 0);
        render.renderFrame(test.getMap());



    }

}
